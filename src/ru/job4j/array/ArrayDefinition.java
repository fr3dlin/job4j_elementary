package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        System.out.println("Размер массива ages = " + ages.length);
        System.out.println("Размер массива surnames = " + surnames.length);
        System.out.println("Размер массива prices = " + prices.length);

        String[] names = new String[4];
        names[0] = "Rail Shamsemuhametov";
        names[1] = "Korobeinikov Stas";
        names[2] = "Петр Арсентьев";
        names[3] = "Andrei Hincu";

        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
    }
}
