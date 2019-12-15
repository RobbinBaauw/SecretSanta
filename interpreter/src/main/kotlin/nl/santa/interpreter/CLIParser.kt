package nl.santa.interpreter

import kotlinx.cli.ArgParser
import kotlinx.cli.ArgType
import kotlin.system.exitProcess

fun parseCLI(args: Array<String>): String {
    val parser = ArgParser("santa")
    val file by parser.argument(ArgType.String, description = "The .santa file to be executed", fullName = "input file")

    return try {
        val parsed = parser.parse(args)
        file
    } catch (e: IllegalStateException) {
        System.err.println(e.message)
        exitProcess(0)
    }
}
