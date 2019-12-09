import antlr4 from "antlr4";
import { JavaScriptLexer } from "./grammar/JavaScriptLexer";
import { JavaScriptParser } from "./grammar/JavaScriptParser";

export const parseInput = code => {
    let inputStream = new antlr4.InputStream(code);
    let lexer = new JavaScriptLexer(inputStream);
    let tokenStream = new antlr4.CommonTokenStream(lexer);
    let parser = new JavaScriptParser(tokenStream);
    parser.buildParseTrees = true;

    let output = "";
    let i = 1;

    while (true) {
        if (tokenStream.LA(i) === -1) {
            break;
        }

        output += tokenStream.LT(i).text + " ";

        i++;
    }

    console.log(output);
};
