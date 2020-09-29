package ru.job4j.convert;

public class Converter {
    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToDollar(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2 dollars. Test result : " + passed);
        in = 280;
        expected = 4;
        out = Converter.rubleToEuro(in);
        passed = expected == out;
        System.out.println("280 rubles are 4 Euro. Test result : " + passed);
    }
}
