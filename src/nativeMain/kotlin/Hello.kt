import kotlinx.cli.*

fun main(args: Array<String>) {
    val parser = ArgParser("example")
    val input by parser.option(ArgType.String, shortName = "i", description = "Input file").required()
    parser.parse(args)
    println(input)
}
