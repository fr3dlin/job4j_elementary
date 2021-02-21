package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        for (char value : board[row]) {
            if (value != 'X') {
                return false;
            }
        }
        return true;
    }

    public static boolean monoVertical(char[][] board, int column) {
        for (char[] row : board) {
            if (row[column] != 'X') {
                return false;
            }
        }
        return true;
    }

    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int i = 0; i < rsl.length; i++) {
            rsl[i] = board[i][i];
        }
        return rsl;
    }

    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int i = 0; i < 5; i++) {
            if (board[i][0] == 'X' || board[4][i] == 'X') {
                if (monoHorizontal(board, i) || monoVertical(board, i)) {
                    return true;
                }
            }
        }
        return result;
    }
}
