package nl.santa.interpreter

import nl.santa.grammar.SantaLangLexer
import nl.santa.grammar.SantaLangParser
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.graalvm.polyglot.Context

fun main(args: Array<String>) {

    try {
        val fileName = parseCLI(args)
        val fileStream = CharStreams.fromFileName(fileName)

        val lexer = SantaLangLexer(fileStream)
        val tokenStream = CommonTokenStream(lexer)
        val code = parseCode(fileName, tokenStream)

        val parser = SantaLangParser(tokenStream)
        parser.removeErrorListeners()
        parser.addErrorListener(ErrorListener)
        parser.buildParseTree = true

        parser.program()

        execute(code)
    } catch (e: SantaError) {
        System.err.println(e.santaMsg)
    } catch (e: Exception) {
        System.err.println("An error occurred!")
        System.err.println(e.message)
    }
}

fun parseCode(fileName: String, tokenStream: CommonTokenStream): String {
    val codeString = StringBuilder()

    var i = 1
    while (true) {
        if (tokenStream.LA(i) == -1) {
            break
        }

        codeString
            .append(when (tokenStream.LA(i)) {
                SantaLangLexer.IllegalKeyword -> throw SantaError("Syntax error, illegal keyword, curr string $codeString")
                SantaLangLexer.TrueLiteral -> "true"
                SantaLangLexer.FalseLiteral -> "false"
                SantaLangLexer.Plus -> "+"
                SantaLangLexer.Minus -> "-"
                SantaLangLexer.Multiply -> "*"
                SantaLangLexer.Divide -> "/"
                SantaLangLexer.Const -> "const"
                SantaLangLexer.Assign -> "="
                SantaLangLexer.Function -> "function"
                SantaLangLexer.For -> "for"
                SantaLangLexer.Of -> "of"
                SantaLangLexer.Continue -> "continue"
                SantaLangLexer.Switch -> "switch"
                SantaLangLexer.Case -> "case"
                SantaLangLexer.Default -> "default"
                SantaLangLexer.Try -> "try"
                SantaLangLexer.Catch -> "catch"
                SantaLangLexer.Finally -> "finally"
                SantaLangLexer.While -> "while"
                SantaLangLexer.ChristmasIsYou -> "const christmas of you"
                SantaLangLexer.ConstStil -> "const"
                SantaLangLexer.With -> "with"
                SantaLangLexer.Coming -> "process"
                SantaLangLexer.To -> "if"
                SantaLangLexer.Town -> "if"
                else -> tokenStream.LT(i).text.toString()
            })
            .append(" ")

        i++
    }

//    val arch = listOf("x32", "x64").random()
    val arch = "x64"

    return """
        const __filename = "$fileName";
        const process = {
            arch: '$arch'
        };
        
        $codeString
    """.trimIndent()
}

fun execute(code: String) {
    Context.create("js").use { context ->
        context.eval("js", code)
    }
}
