package nl.santa

import nl.santa.grammar.JavaScriptLexer
import nl.santa.grammar.JavaScriptParser
import org.antlr.v4.runtime.*
import org.antlr.v4.runtime.atn.ATNConfigSet
import org.antlr.v4.runtime.dfa.DFA
import org.graalvm.polyglot.Context
import org.graalvm.polyglot.Value
import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
import java.util.stream.Collectors

fun main(args: Array<String>) {

    val fileStream = CharStreams.fromFileName("test.js")

    val lexer = JavaScriptLexer(fileStream)
    val tokenStream = CommonTokenStream(lexer)

    val parser = JavaScriptParser(tokenStream)
    parser.removeErrorListeners()
    parser.addErrorListener(object : ANTLRErrorListener {
        override fun reportAttemptingFullContext(
            recognizer: Parser?,
            dfa: DFA?,
            startIndex: Int,
            stopIndex: Int,
            conflictingAlts: BitSet?,
            configs: ATNConfigSet?
        ) {
            println("SYNTAX ERROR")
        }

        override fun syntaxError(
            recognizer: Recognizer<*, *>?,
            offendingSymbol: Any?,
            line: Int,
            charPositionInLine: Int,
            msg: String?,
            e: RecognitionException?
        ) {
            println("SYNTAX ERROR")
            error(msg ?: "")
        }

        override fun reportAmbiguity(
            recognizer: Parser?,
            dfa: DFA?,
            startIndex: Int,
            stopIndex: Int,
            exact: Boolean,
            ambigAlts: BitSet?,
            configs: ATNConfigSet?
        ) {
            println("SYNTAX ERROR")
        }

        override fun reportContextSensitivity(
            recognizer: Parser?,
            dfa: DFA?,
            startIndex: Int,
            stopIndex: Int,
            prediction: Int,
            configs: ATNConfigSet?
        ) {
            println("SYNTAX ERROR")
        }

    })

    val stat = parser.expressionStatement()

    val codeString = StringBuilder()

    var i = 1
    while (true) {
        if (tokenStream.LA(i) == -1) {
            break
        }

        codeString.append(tokenStream.LT(i).text.toString() + " ")
        i++
    }

    Context.create("js").use { context ->
        context.eval("js", codeString.toString())
    }
}
