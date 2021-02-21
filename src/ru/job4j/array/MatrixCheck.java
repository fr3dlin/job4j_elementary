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
}
