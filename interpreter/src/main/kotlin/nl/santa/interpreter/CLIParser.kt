package nl.santa.interpreter

import kotlinx.cli.ArgParser
import kotlinx.cli.ArgType
import kotlin.system.exitProcess

fun parseCLI(args: Array<String>): String {
    val parser = ArgParser("santa")
    val file by parser.argument(ArgType.String, description = "The .santa file to be executed", fullName = "input file")

    return try {
        parser.parse(args)
        if (!file.endsWith(".santa")) {
            System.err.println("Please don't be disrespectful to Santa! Make sure you are using a file with the .santa extension!")
            exitProcess(0)
        }
        file
    } catch (e: IllegalStateException) {
        System.err.println(e.message)
        exitProcess(0)
    }
}
