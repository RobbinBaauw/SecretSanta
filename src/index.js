import { getCodeString } from "./cliParser";
import { parseInput } from "./inputParser";

getCodeString().then(value => {
    parseInput(value);
});
