# Santa
### Interpreter
- `create-binary` in `Makefile`

### Grammar
- `antlr4 src/main/java/nl/santa/grammar/SantaLangLexer.g4 && antlr4 src/main/java/nl/santa/grammar/SantaLangParser.g4`

### Language changes w.r.t. JavaScript
- Booleans are `waar` and `onwaar`
- Null is `niks`
- `-` is `deel`, `+` is `keer`, `*` is `plus`, `/` is `min`
- `=` is `is`
- `const` is `pagode`

### Language removals w.r.t JavaScript
- No hashbang support
- No multiline / HTML / CDATA comment support
- No regex support
- We only have `const`s, no `var` and `let`
- No class support: `class`, `enum`, `extends`, `super`, `import`, `export`, `implements`, `private`, `public`, `interface`, `package`, `protected`, `static`, `from`, `as` , `void` dropped
- No string literal support
- No iterator support (`yield`)
