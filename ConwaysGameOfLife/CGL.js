class CGL {

    constructor (string) {
        this.start(string);
    }

    init (string) {
        this.board = [];
        this.aux_board = [];
        switch (string) {
            case(""):
                for (let i = 0 ; i < 5 ; i++) {
                    this.board[i] = [];
                    for (let j = 0 ; j < 5 ; j++) {
                        this.board[i][j] = (Math.random() > 0.5) ? 1 : 0;
                    }
                }
                break;
            case("Blinker"):
                this.board = [  [0, 0, 0, 0, 0],
                            [0, 0, 1, 0, 0],
                            [0, 0, 1, 0, 0],
                            [0, 0, 1, 0, 0],
                            [0, 0, 0, 0, 0]];

        }
        for (let i = 0 ; i < 5 ; i++) {
            this.aux_board[i] = [];
            for (let j = 0 ; j < 5 ; j++) {
                this.aux_board[i][j] = this.board[i][j];
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
        for (let i = 0 ; i < 5 ; i++) {
            for (let j = 0 ; j < 5; j++) {
                this.aux_board[i][j] = this.updateCell(i,j);
            }
        }
        for (let i = 0 ; i < 5 ; i++) {
            for (let j = 0 ; j < 5 ; j++) {
                this.board[i][j] = this.aux_board[i][j];
            }
        }
    }

    showBoard () {
        for (let i = 0 ; i < 5; i++) {
            for (let j = 0 ; j < 5; j++) {
                process.stdout.write(this.board[i][j] + " ");
            }
            console.log();
        }
    }

    start(string) {
        this.init(string);
        for (let i = 0 ; i < 5; i++) {
            this.showBoard();
            this.update();
            console.log("#########")
        }
    }
}

CGL = new CGL("");