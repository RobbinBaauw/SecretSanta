package nl.santa.interpreter

import nl.santa.grammar.SantaLangLexer
import nl.santa.grammar.SantaLangParser
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.graalvm.polyglot.Context
import org.graalvm.polyglot.Language

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

//        parser.program()

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
                SantaLangLexer.Continue -> "continue"
                else -> tokenStream.LT(i).text.toString()
            })
            .append(" ")

        i++
    }

    val arch = listOf("arm", "arm64", "x32", "x64").random()

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
