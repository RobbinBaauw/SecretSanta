import yargs from "yargs";
import fs from "fs";

export const getCodeString = () => {
    return new Promise(resolve => {
        const argv = yargs
            .usage("Usage: santa <file name>")
            .alias("f", "file")
            .nargs("f", 1)
            .describe("f", "Load a file")
            .demandOption(["f"])
            .help("h")
            .alias("h", "help")
            .epilog("copyright 2019").argv;

        const s = fs.createReadStream(argv.file);

        s.on("data", buf => {
            return resolve(buf.toString());
        });
    });
};
