package ru.job4j.calculator;

public class Converter {
    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
       return value / 60; /* формула перевода рублей в доллары. */
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        int usd = Converter.rubleToDollar(120);
        System.out.println("120 rubles are " + usd + " dollars.");

        int in = 120;
        int expected = 2;
        int out = Converter.rubleToDollar(in);
        boolean passed = expected == out;
        System.out.println("120 dollars are 2. Test result : " + passed);
    }
}
