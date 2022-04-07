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

class CGL {

    constructor (string, iters, size, boolean) {
        this.iters = iters;
        this.init(string, boolean, size);
        this.start(iters);
    }

    init (string, boolean, size) {
        this.board = [];
        this.aux_board = [];
        this.previous = [];
        for (let i = 0 ; i < size ; i++) {
            this.board[i] = [];
            for (let j = 0 ; j < size ; j++) {
                if (boolean) {
                    this.board[i][j] = (Math.random() > 0.5) ? 1 : 0;
                } else {
                    this.board[i][j] = 0;
                } 
            }
        }
        switch (string) {
            case (""):
                for (let i = 0 ; i < this.board.length ; i++) {
                    this.board[i] = [];
                    for (let j = 0 ; j < this.board[i].length ; j++) {
                        this.board[i][j] = (Math.random() > 0.5) ? 1 : 0;
                    }
                }
                break;
            case ("Blinker"):
                this.merge(Factory.newBlinker());
                break;
            case ("Beacon"):
                this.merge(Factory.newBeacon());
                break;
            case ("Toad"):
                this.merge(Factory.newToad());
                break;
            case ("Glider"):
                this.merge(Factory.newGlider());
                break;
            case ("Diamond"):
                this.merge(Factory.newDiamond());
                break;
            case ("Pentomino"):
                this.merge(Factory.newPentomino());
                break;
            case ("Wikipedia"):
                this.merge(Factory.newWikipedia());
                break;
            case ("Diehard"):
                this.merge(Factory.newDiehard());
                break;
            
        }
        for (let i = 0 ; i < this.board.length ; i++) {
            this.aux_board[i] = [];
            for (let j = 0 ; j < this.board[i].length ; j++) {
                this.aux_board[i][j] = this.board[i][j];
            }
        }
        this.updatePrevious();
    }

    merge (m) {
        for (let i = 0 ; i < m.length ; i++) {
            for (let j = 0 ; j < m[i].length ; j++) {
                this.board[this.board.length/2+i][this.board[0].length/2+j] = m[i][j];
            }
        }
    }

    neighbors(row, col) {
        let count = 0;
        if (row > 0) {
            count+=this.board[row-1][col];   // up
            if (col > 0) {
                count+=this.board[row-1][col-1]; // up-left
            }
            if (col < this.board[0].length-1) {
                count+=this.board[row-1][col+1]; // up-right
            }
        }
        if (row < this.board.length-1) {
            count+=this.board[row+1][col];   // bottom
            if (col > 0) {
                count+=this.board[row+1][col-1]; // bottom-left
            }
            if (col < this.board[0].length-1) {
                count+=this.board[row+1][col+1]; // bottom-right
            }
        }
        if (col > 0) {
            count+=this.board[row][col-1];   // left
        }
        if (col < this.board[0].length-1) {
            count+=this.board[row][col+1];   // right
        }
        return count;
    }

    updateCell (row, col) {
        const n = this.neighbors(row, col);
        if (n != 2 && n!= 3) {
            return 0;   // Any alive cell with other than 2 or 3 neighbors dies
        }
        if (this.board[row][col] === 0 && n === 3) {
            return 1;   // Any dead cell with 3 neighbors becomes a live cell
        }
        return this.board[row][col];
    }

    update () {
        for (let i = 0 ; i < this.board.length ; i++) {
            for (let j = 0 ; j < this.board[i].length ; j++) {
                this.aux_board[i][j] = this.updateCell(i,j);
            }
        }
        for (let i = 0 ; i < this.board.length ; i++) {
            for (let j = 0 ; j < this.board[i].length ; j++) {
                this.board[i][j] = this.aux_board[i][j];
            }
        }
    }

    showBoard () {
        for (let i = 0 ; i < this.board.length ; i++) {
            for (let j = 0 ; j < this.board[i].length ; j++) {
                process.stdout.write(this.board[i][j] + " ");
            }
            console.log();
        }
    }

    separator (idx) {
        let off = Logic.numbers(idx)%2;
        for (let i = 0 ; i < this.board[0].length-Logic.numbers(idx)/2-off; i++) {
                process.stdout.write("#");
        }
        process.stdout.write(idx + "");
        for (let i = 0 ; i < this.board[0].length-(Logic.numbers(idx)-Logic.numbers(idx)/2)-1; i++) {
                process.stdout.write("#");
        }
        console.log();
    }

    updatePrevious () {
        for (let i = 0 ; i < this.board.length ; i++) {
            this.previous[i] = [];
            for (let j = 0 ; j < this.board[i].length; j++) {
                this.previous[i][j] = this.board[i][j];
            }
        }
    }

    differentBoards() {
        for (let i = 0 ; i < this.board.length ; i++) {
            for (let j = 0 ; j < this.board.length ; j++) {
                if (this.board[i][j] != this.previous[i][j]) {
                    return true;
                }
            }
        }
        return false; 
    }

    async start(iters) {
        let i = 1;
        do {
            this.separator(i++);
            this.showBoard();
            this.updatePrevious();
            this.update();
            await Logic.sleep(100);
        } while (iters--!=0 && this.differentBoards());
/*
        for (let i = 0 ; i < this.iters ; i++) {
            this.separator(i);
            this.showBoard();
            this.updatePrevious();
            this.update();
            await Logic.sleep(100);
            if (this.equalBoards()) {
                break;
            }
        }
        */
    }
}

CGL = new CGL("Diamond", 1200, 50, false);