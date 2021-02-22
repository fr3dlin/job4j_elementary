package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = i; j < size; j++) {
                table[i][j] = (i + 1) * (j + 1);
                table[j][i] = table[i][j]; //заполнение таблицы под диагональю
            }
        }
        return table;
    }
}
