class Factory {
    static newEmpty() {
        return [[0, 0, 0, 0, 0],
        [0, 0, 0, 0, 0],
        [0, 0, 0, 0, 0],
        [0, 0, 0, 0, 0],
        [0, 0, 0, 0, 0]];
    }

    // Oscillators 
    static newBlinker() {
        return [[0, 0, 0, 0, 0],
        [0, 0, 1, 0, 0],
        [0, 0, 1, 0, 0],
        [0, 0, 1, 0, 0],
        [0, 0, 0, 0, 0]];
    }

    static newBeacon() {
        return [[0, 0, 0, 0, 0, 0],
        [0, 1, 1, 0, 0, 0],
        [0, 1, 0, 0, 0, 0],
        [0, 0, 0, 0, 1, 0],
        [0, 0, 0, 1, 1, 0],
        [0, 0, 0, 0, 0, 0]];
    }

    static newToad() {
        return [[0, 0, 0, 0, 0, 0],
        [0, 0, 0, 0, 0, 0],
        [0, 0, 1, 1, 1, 0],
        [0, 1, 1, 1, 0, 0],
        [0, 0, 0, 0, 0, 0],
        [0, 0, 0, 0, 0, 0]];
    }

    // Spaceships
    static newGlider() {
        return [[0, 0, 0, 0, 0],
        [0, 0, 1, 0, 0],
        [0, 0, 0, 1, 0],
        [0, 1, 1, 1, 0],
        [0, 0, 0, 0, 0]];
    }

    static newLWSS() {
        return [[0, 0, 0, 0, 0, 0, 0],
        [0, 0, 1, 0, 0, 1, 0],
        [0, 1, 0, 0, 0, 0, 0],
        [0, 1, 0, 0, 0, 1, 0],
        [0, 1, 1, 1, 1, 0, 0],
        [0, 0, 0, 0, 0, 0, 0]];
    }

    static newMWSS() {
        return [[0, 0, 0, 0, 0, 0, 0, 0],
        [0, 0, 0, 0, 1, 0, 0, 0],
        [0, 0, 1, 0, 0, 0, 1, 0],
        [0, 1, 0, 0, 0, 0, 0, 0],
        [0, 1, 0, 0, 0, 0, 1, 0],
        [0, 1, 1, 1, 1, 1, 0, 0],
        [0, 0, 0, 0, 0, 0, 0, 0]];
    }

    static newHWSS() {
        return [[0, 0, 0, 0, 0, 0, 0, 0, 0],
        [0, 0, 0, 0, 1, 1, 0, 0, 0],
        [0, 0, 1, 0, 0, 0, 0, 1, 0],
        [0, 1, 0, 0, 0, 0, 0, 0, 0],
        [0, 1, 0, 0, 0, 0, 0, 1, 0],
        [0, 1, 1, 1, 1, 1, 1, 0, 0],
        [0, 0, 0, 0, 0, 0, 0, 0, 0]];
    }

    // Guns
    static newGGG() {
        return Factory.newAbstract(38, 11, [
            [],
            [25],
            [23, 25],
            [13, 14, 21, 22, 35, 36],
            [12, 16, 21, 22, 35, 36],
            [1, 2, 11, 17, 21, 22],
            [1, 2, 11, 15, 17, 18, 23, 25],
            [11, 17, 25],
            [12, 16],
            [13, 14],
            []
        ]);
    }

    static newSGG() {
        return Factory.newAbstract(37, 25, [
            [],
            [],
            [2, 3, 9, 10],
            [2, 3, 9, 10],
            [],
            [6, 7],
            [6, 7],
            [],
            [],
            [],
            [],
            [24, 25, 27, 28],
            [23, 29],
            [23, 30, 33, 34],
            [23, 24, 25, 29, 33, 34],
            [28],
            [],
            [],
            [],
            [22, 23],
            [22],
            [23, 24, 25],
            [25],
            [],
            []
        ]);
    }

    // Methuselahs
    static newPentomino() {
        return [[0, 0, 0, 0, 0],
        [0, 0, 1, 0, 0],
        [0, 0, 1, 1, 0],
        [0, 1, 1, 0, 0],
        [0, 0, 0, 0, 0]];
    }

    static newDiehard() {
        return [[0, 0, 0, 0, 0, 0, 0, 0, 0, 0],
        [0, 0, 0, 0, 0, 0, 0, 1, 0, 0],
        [0, 1, 1, 0, 0, 0, 0, 0, 0, 0],
        [0, 0, 1, 0, 0, 0, 1, 1, 1, 0],
        [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]];
    }

    static newDiamond() {
        return [[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0],
        [0, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0],
        [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0],
        [0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0],
        [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0],
        [0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0],
        [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0],
        [0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0],
        [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0],
        [0, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0],
        [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]];
    }

    static newAbstract(x_size, y_size, pattern) {
        let out = [];
        console.log(x_size, y_size, pattern);
        for (let i = 0; i < y_size; i++) {
            out[i] = [];
            for (let j = 0; j < x_size; j++) {
                out[i][j] = 0;
            }
        }
        console.log(out);
        for (let i = 0; i < pattern.length; i++) {
            for (let j = 0; j < pattern[i].length; j++) {
                out[i][pattern[i][j]] = 1;
            }
        }
        console.log(out);
        return out;
    }
}

class SITR {
    constructor(string) {
        this.string = string;
        this.idx = 0;
    }

    hasNext() {
        return this.string.length != this.idx;
    }

    next() {
        return this.string.charAt(this.idx++);
    }
}

class QuickList {

    constructor() {
        this.data = [];
        this.size = 0;
    }

    add(int) {
        this.data[this.size++] = int;
    }

    get(int) {
        return this.data[int];
    }

    size() {
        return this.size;
    }

    toArray() {
        return this.data;
    }
}

class Logic {

    static maxLength(data) {
        let max = 0;
        for (let i = 0; i < data.length; i++) {
            for (let j = 0; j < data[i].length; j++) {
                if (data[i][j] > max) {
                    max = data[i][j];
                }
            }
        }
        return max;
    }

    static parse(string) {
        let out = [];
        let row = 0;
        let sitr = new SITR(string);
        sitr.next(); // skip '['
        while (sitr.hasNext()) {
            let current = sitr.next();
            switch (current) {
                case '[':
                    out[row++] = new QuickList();
                    break;
                case ']':
                    break;
                case ',':
                    break;
                case ' ':
                    break;
                case '%':
                    sitr.next(); // 2
                    sitr.next(); // 0
                    break;
                default:
                    out[row - 1].add(parseInt(current));
            }
        }
        for (let i = 0; i < out.length; i++) {
            out[i] = out[i].toArray();
        }
        return out;
    }

    static sleep(ms) {
        return new Promise(resolve => setTimeout(resolve, ms));
    }

    static numbers(n) {
        return Math.floor(Math.log10(n) + 1);
    }
}

function newTemplate(name) {
    switch (name) {
        case '':
            return Factory.newEmpty(); break;
        case 'Blinker':
            return Factory.newBlinker(); break;
        case 'Beacon':
            return Factory.newBeacon(); break;
        case 'Toad':
            return Factory.newToad(); break;
        case 'Glider':
            return Factory.newGlider(); break;
        case 'LWSS':
            return Factory.newLWSS(); break;
        case 'MWSS':
            return Factory.newMWSS(); break;
        case 'HWSS':
            return Factory.newHWSS(); break;
        case 'GGG':
            return Factory.newGGG(); break;
        case 'SGG':
            return Factory.newSGG(); break;
        case 'Pentomino':
            return Factory.newPentomino(); break;
        case 'Diehard':
            return Factory.newDiehard(); break;
        case 'Diamond':
            return Factory.newDiamond(); break;
        default:
            let data = Logic.parse(name);
            return Factory.newAbstract(Logic.maxLength(data) + 1, data.length, data); break;
    }
}

function getPrintout(board, alive, dead, aliveColor, deadColor) {
    let out = "";
    for (let i = 0; i < board.length; i++) {
        for (let j = 0; j < board[i].length; j++) {
            out += ((board[i][j]) ? ("<span style='padding:0px; color:" + aliveColor + "'>" + alive + "</span>") : ("<span style='padding:0px; color:" + deadColor + "'>" + dead + "</span>")) + " ";
            //out += ((board[i][j]) ? ("<span style='padding:0px; color:" + aliveColor + "'>" + alive + "</span>") : ) + " ";
        }
        out += "<br>";
    }
    return out;
}

function showBoard(board, alive, dead, aliveColor, deadColor) {
    document.getElementById("output").innerHTML =
        document.getElementById("output").innerHTML + "<br>" +
        getPrintout(board, alive, dead, aliveColor, deadColor);
}

function output(text) {
    document.getElementById("output").innerHTML =
        document.getElementById("output").innerHTML + text;
}

function neighbors(board, row, col) {
    let count = 0;
    if (row > 0) {
        count = board[row - 1][col];   // up
        if (col > 0) {
            count += board[row - 1][col - 1]; // up-left
        }
        if (col < board[0].length - 1) {
            count += board[row - 1][col + 1]; // up-right
        }
    }
    if (row < board.length - 1) {
        count += board[row + 1][col];   // bottom
        if (col > 0) {
            count += board[row + 1][col - 1]; // bottom-left
        }
        if (col < board[0].length - 1) {
            count += board[row + 1][col + 1]; // bottom-right
        }
    }
    if (col > 0) {
        count += board[row][col - 1];   // left
    }
    if (col < board[0].length - 1) {
        count += board[row][col + 1];   // right
    }
    return count;
}

function update(board, aux_board) {
    for (let i = 0; i < board.length; i++) {
        for (let j = 0; j < board[i].length; j++) {
            aux_board[i][j] = updateCell(board, i, j);
        }
    }
    return aux_board;
}

function sync(board, aux_board) {
    for (let i = 0; i < board.length; i++) {
        for (let j = 0; j < board[i].length; j++) {
            board[i][j] = aux_board[i][j];
        }
    }
}

function updateCell(board, row, col) {
    const n = neighbors(board, row, col);
    if (n !== 2 && n !== 3) {
        return 0;       // Any alive cell with other 2 or 3 neighbors dies
    }
    if (board[row][col] === 0 && n === 3) {
        return 1;       // Any dead cell with thre 3 neighbors becomes a live cell
    }
    return board[row][col];
}

function separator(idx, size) {
    let off = Logic.numbers(idx) % 2;
    let str = "";
    for (let i = 0; i < size - Logic.numbers(idx) / 2 - off; i++) {
        str += "#";
    }
    str += idx;
    for (let i = 0; i < size - (Logic.numbers(idx) - (Logic.numbers(idx) / 2 - off)); i++) {
        str += "#";
    }
    str += " ";
    output(str);
}

function merge(board, template) {
    for (let i = 0; i < template.length; i++) {
        for (let j = 0; j < template[i].length; j++) {
            let a = Math.floor(board.length / 2) - Math.floor(template.length / 2);
            let b = Math.floor(board[i].length / 2) - Math.floor(template[i].length / 2);
            board[a + i][b + j] = template[i][j];
        }
    }
    return board;
}

function newEmptyBoard(size) {
    let board = [];
    for (let i = 0; i < size; i++) {
        board[i] = [];
        for (let j = 0; j < size; j++) {
            board[i][j] = 0;
        }
    }
    return board;
}

function areDifferent(boardA, boardB) {
    if (boardA.length !== boardB.length) {
        return true;
    }
    for (let i = 0; i < boardA.length; i++) {
        if (boardA[i].length !== boardB[i].length) {
            return true;
        }
        for (let j = 0; j < boardA[i].length; j++) {
            if (boardA[i][j] !== boardB[i][j]) {
                return true;
            }
        }
    }
    return false;
}

function play(name, iters, alive, dead, aliveColor, deadColor) {
    let board = merge(newEmptyBoard(50), newTemplate(name));
    let aux_board = merge(newEmptyBoard(board.length), newTemplate(name));
    let previous_board = newEmptyBoard(board.length);
    for (let i = 1; i != iters && areDifferent(board, previous_board); i++) {
        sync(previous_board, board);
        separator(i, board[0].length);
        showBoard(board, alive, dead, aliveColor, deadColor);
        sync(board, update(board, aux_board));
        console.log("board (" + i + "):\n" + getPrintout(board, 1, 0));
        console.log("previous_board (" + i + "):\n" + getPrintout(previous_board, 1, 0));
    }
    separator("End of Simulation", board[0].length);
}
