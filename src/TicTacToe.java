public class TicTacToe {
    private String[][] board;
    private int turn;

    // Constructor to initialize the board and set the starting turn
    public TicTacToe() {
        board = new String[3][3]; // 3x3 Tic-Tac-Toe board
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = "-"; // Initialize all spots with "-"
            }
        }
        turn = 0; // 0 means it's X's turn
    }

    // This method returns the current turn (0 for X, 1 for O)
    public int getTurn() {
        return turn;
    }

    /* This method prints out the board array on to the console */
    public void printBoard() {
        System.out.println("  0 1 2");
        for (int row = 0; row < 3; row++) {
            System.out.print(row + " "); // Row label
            for (int col = 0; col < 3; col++) {
                System.out.print(board[row][col] + " "); // Print each cell
            }
            System.out.println();
        }
    }

    // This method returns true if space row, col is a valid space
    public boolean pickLocation(int row, int col) {
        if (row < 0 || row >= 3 || col < 0 || col >= 3) {
            return false; // Out of bounds
        }
        if (!board[row][col].equals("-")) {
            return false; // Spot already taken
        }
        return true;
    }

    // This method places an X or O at location row, col based on the int turn
    public void takeTurn(int row, int col) {
        if (turn % 2 == 0) {
            board[row][col] = "X"; // X's turn
        } else {
            board[row][col] = "O"; // O's turn
        }
        turn++; // Increment turn after placing a piece
    }

    // This method returns a boolean that returns true if a row has three X or O's in a row
    public boolean checkRow() {
        for (int row = 0; row < 3; row++) {
            if (!board[row][0].equals("-") &&
                    board[row][0].equals(board[row][1]) &&
                    board[row][1].equals(board[row][2])) {
                return true;
            }
        }
        return false;
    }

    // This method returns a boolean that returns true if a column has three X or O's
    public boolean checkCol() {
        for (int col = 0; col < 3; col++) {
            if (!board[0][col].equals("-") &&
                    board[0][col].equals(board[1][col]) &&
                    board[1][col].equals(board[2][col])) {
                return true;
            }
        }
        return false;
    }

    // This method returns a boolean that returns true if either diagonal has three X or O's
    public boolean checkDiag() {
        // Top-left to bottom-right
        if (!board[0][0].equals("-") &&
                board[0][0].equals(board[1][1]) &&
                board[1][1].equals(board[2][2])) {
            return true;
        }

        // Top-right to bottom-left
        if (!board[0][2].equals("-") &&
                board[0][2].equals(board[1][1]) &&
                board[1][1].equals(board[2][0])) {
            return true;
        }

        return false;
    }

    // This method returns a boolean that checks if someone has won the game
    public boolean checkWin() {
        return checkRow() || checkCol() || checkDiag();
    }
}
