let inputStream = new antlr4.InputStream("text");
let lexer = new JavaScriptLexer(inputStream);
let tokenStream = new antlr4.CommonTokenStream(lexer);
let parser = new JavaScriptParser(tokenStream);
parser.buildParseTrees = true;
