package nl.santa.interpreter

import nl.santa.grammar.SantaLangLexer
import nl.santa.grammar.SantaLangParser
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.graalvm.polyglot.Context

fun main(args: Array<String>) {

    val fileName = parseCLI(args)
    val fileStream = CharStreams.fromFileName(fileName)

    val lexer = SantaLangLexer(fileStream)
    val tokenStream = CommonTokenStream(lexer)
    val code = parseCode(tokenStream)

    val parser = SantaLangParser(tokenStream)
    parser.removeErrorListeners()
    parser.addErrorListener(ErrorListener)
    parser.buildParseTree = true

    if (!hasSyntaxErrors(parser)) {
        execute(code)
    } else {
        System.err.println("Syntax error")
    }
}

fun hasSyntaxErrors(parser: SantaLangParser): Boolean {
    return try {
        parser.program()
        false
    } catch (e: SyntaxError) {
        true
    }
}

fun parseCode(tokenStream: CommonTokenStream): String {
    val codeString = StringBuilder()

    var i = 1
    while (true) {
        if (tokenStream.LA(i) == -1) {
            break
        }

        codeString.append(tokenStream.LT(i).text.toString() + " ")
        i++
    }

    return codeString.toString()
}

fun execute(code: String) {
    Context.create("js").use { context ->
        context.eval("js", code)
    }
}
