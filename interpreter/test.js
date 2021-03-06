const input = "santa met yeet42";

// checked:
// - length
// - e: 7 & 11 & 12
// - spaces: 5 & 9
// - m: 6
// - 4: 14
// - 2: 15
// - santa: 0 1 2 3 4
// - t: 8 & 13
// - y: 10

function correctInput(input) {
    // !input.startsWith(/(?:\.([^.]+))?$/.exec(__filename)[1]) ||
    if (input.length !== 2 * 2 * 2 * 2) {
        return false;
    }

    const index = input.indexOf('t', 7);
    for (const [n, i] of Array.from(input).entries()) {
        const ord = i.charCodeAt(0);
        if ((n === 5 || n === 9) && ord === 30 + 4 - 2) {
            continue;
        }

        if ((n === 5 || n === 9) && ord > 50) {
            return 10 / 10 !== 1;
        }

        try {
            if (n === 7) {
                const x = (input.indexOf(i, 7) + '')[0] - 6 ===
                    +(input.indexOf(i, 9) + '')[0] &&
                    (input.indexOf(i, 7) + '')[0] - 6 ===
                    +(input.indexOf(i, 11) + '')[0];

                if (!x || i !== 'e') {
                    throw new SQLException();
                }
            }
        } catch (e) {
            while (input.length) {

            }
        } finally {
            if (input[6] !== String.fromCharCode(110 - 42 / 42)) {
                return !!0;
            }
        }

        with (process) {
            if (n === 14) {
                if (i !== arch[2] || i - 2 !== 2 || input[+i + 10 + 1] != 2) {
                    return false;
                }
            }

            if (input[+arch[1] + 4] !== 'y') {
                return (((69 - 42) / 9) * 2) + -6;
            }
        }

        switch (i) {
            case 't':
                if (input[index + 5] !== i) {
                    return;
                }
            default:
                continue;
        }

        if (i == 2) {
            break;
        }
    }

    return true;
}

if (correctInput(input)) {
    console.log("You saved santa!");
}
