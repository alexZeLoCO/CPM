class Factory {
    // Oscillators 
    static newBlinker () {
        return [[0, 0, 0, 0, 0],
                [0, 0, 1, 0, 0],
                [0, 0, 1, 0, 0],
                [0, 0, 1, 0, 0],
                [0, 0, 0, 0, 0]];
    }

    static newBeacon () {
        return [[0, 0, 0, 0, 0, 0],
                [0, 1, 1, 0, 0, 0],
                [0, 1, 0, 0, 0, 0],
                [0, 0, 0, 0, 1, 0],
                [0, 0, 0, 1, 1, 0],
                [0, 0, 0, 0, 0, 0]];
    }

    static newToad () {
        return [[0, 0, 0, 0, 0, 0],
                [0, 0, 0, 0, 0, 0],
                [0, 0, 1, 1, 1, 0],
                [0, 1, 1, 1, 0, 0],
                [0, 0, 0, 0, 0, 0],
                [0, 0, 0, 0, 0, 0]];
    }

    // Spaceships
    static newGlider () {
        return [[0, 0, 0, 0, 0],
                [0, 0, 1, 0, 0],
                [0, 0, 0, 1, 0],
                [0, 1, 1, 1, 0],
                [0, 0, 0, 0, 0]];
    }

    // Methuselahs
    // FIXME: None of these seem to work. I may need a matrix bigger than my screen for them to become stable.
    static newPentomino () {
        return [[0, 0, 0, 0, 0],
                [0, 0, 1, 0, 0],
                [0, 0, 1, 1, 0],
                [0, 1, 1, 0, 0],
                [0, 0, 0, 0, 0]];
    }

    static newWikipedia () {
        return [[0, 0, 0, 0, 0],
                [0, 1, 1, 0, 0],
                [0, 0, 1, 1, 0],
                [0, 0, 1, 0, 0],
                [0, 0, 0, 0, 0]];
    }

    static newDiehard () {
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
}

class Logic {
    static sleep (ms) {
        return new Promise (resolve => setTimeout(resolve, ms));
    }

    static numbers (n) {
        return Math.floor(Math.log10(n)+1);
    }
}

function newTemplate (name) {
    switch (name) {
        case 'Blinker': 
        return Factory.newBlinker(); break;
        case 'Beacon':
            return Factory.newBeacon(); break;
        case 'Toad':
            return Factory.newToad(); break;
        case 'Glider':
            return Factory.newGlider(); break;
        case 'Pentomino': 
            return Factory.newPentomino(); break;
        case 'Wikipedia':
            return Factory.newWikipedia(); break;
    }
}

function getPrintout (board) {
    let out = "";
    for (let i = 0 ; i < board.length ; i++) {
        for (let j = 0 ; j < board[i].length ; j++) {
            out+=board[i][j] + " ";
        }
        out+="<br>";
    }
    return out;
}

function showBoard (board) {
    document.getElementById("output").innerHTML =
        document.getElementById("output").innerHTML + "<br>" +
        getPrintout(board);
}

function output (text) {
    document.getElementById("output").innerHTML =
        document.getElementById("output").innerHTML + text;
}

function neighbors (board, row, col) {
    let count = 0;
    if (row > 0) {
        count=board[row-1][col];   // up
        if (col > 0) {
            count+=board[row-1][col-1]; // up-left
        }
        if (col < board[0].length-1) {
            count+=board[row-1][col+1]; // up-right
        }
    }
    if (row < board.length-1) {
        count+=board[row+1][col];   // bottom
        if (col > 0) {
            count+=board[row+1][col-1]; // bottom-left
        }
        if (col < board[0].length-1) {
            count+=board[row+1][col+1]; // bottom-right
        }
    }
    if (col > 0) {
        count+=board[row][col-1];   // left
    }
    if (col < board[0].length-1) {
        count+=board[row][col+1];   // right
    }
    return count;
}

function update (board, aux_board) {
    for (let i = 0 ; i < board.length ; i++) {
        for (let j = 0 ; j < board[i].length ; j++) {
            aux_board[i][j] = updateCell(board, i,j);
        }
    }
    return aux_board;
}

function sync (board, aux_board) {
    for (let i = 0 ; i < board.length ; i++) {
        for (let j = 0 ; j < board[i].length ; j++) {
            board[i][j] = aux_board[i][j];
        }
    }
}

function updateCell(board, row, col) {
    const n = neighbors(board, row, col);
    if (n !== 2 && n!==3){
        return 0;       // Any alive cell with other 2 or 3 neighbors dies
    }
    if (board[row][col] === 0 && n===3) {
        return 1;       // Any dead cell with thre 3 neighbors becomes a live cell
    }
    return board[row][col];
}

function separator (idx, size) {
    let off = Logic.numbers(idx)%2;
    let str = "";
    for (let i = 0 ; i < size-Logic.numbers(idx)/2-off ; i++) {
        str+="#";
    }
    str+=idx;
    for (let i = 0 ; i < size-(Logic.numbers(idx)-(Logic.numbers(idx)/2-off)) ; i++) {
        str+="#";
    }
    str+=" ";
    output(str);
}

function merge (board, template) {
    for (let i = 0 ; i < template.length; i++) {
        for (let j = 0 ; j < template[i].length; j++) {
            let a = Math.floor(board.length/2)-Math.floor(template.length/2);
            let b = Math.floor(board[i].length/2)-Math.floor(template.length/2);
            board[a+i][b+j] = template[i][j];
        }
    }
    return board;
}

function newEmptyBoard (size) {
    let board = [];
    for (let i = 0 ; i < size ; i++) {
        board[i] = [];
        for (let j = 0 ; j < size ; j++) {
            board[i][j] = 0;
        }
    }
    return board;
}

function play (name, iters) {
    let board = merge(newEmptyBoard(50), newTemplate(name));
    let aux_board = merge(newEmptyBoard(board.length), newTemplate(name));
    for (let i = 0 ; i < iters; i++) {
        separator(i+1, board[0].length);
        showBoard(board);
        sync(board, update(board, aux_board));
    }
    separator("Fin de Simulación", board[0].length);
}
