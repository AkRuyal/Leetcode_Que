class Solution {

    public boolean isSafe(char[][] board, int row, int col, int no) {

        // Check column
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == (char)(no + '0')) {
                return false;
            }
        }

        // Check row
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == (char)(no + '0')) {
                return false;
            }
        }

        // Check 3x3 grid
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;

        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (board[i][j] == (char)(no + '0')) {
                    return false;
                }
            }
        }

        return true;
    }

    public boolean helper(char[][] board, int row, int col) {

        // All cells completed
        if (row == board.length) {
            return true;
        }

        // Calculate next cell
        int nrow;
        int ncol;

        if (col != board.length - 1) {
            nrow = row;
            ncol = col + 1;
        } else {
            nrow = row + 1;
            ncol = 0;
        }

        // If cell is already filled
        if (board[row][col] != '.') {
            return helper(board, nrow, ncol);
        }

        // Try numbers 1 to 9
        for (int i = 1; i <= 9; i++) {

            if (isSafe(board, row, col, i)) {

                // Place number
                board[row][col] = (char)(i + '0');

                // Move to next cell
                if (helper(board, nrow, ncol)) {
                    return true;
                }

                // Backtrack
                board[row][col] = '.';
            }
        }

        return false;
    }

    public void solveSudoku(char[][] board) {
        helper(board, 0, 0);
    }
}