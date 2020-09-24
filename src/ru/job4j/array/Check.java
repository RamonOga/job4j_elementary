package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        boolean temp = data[0];
                for (boolean chk: data) {
                    if (chk != temp) {
                        result = false;
                        break;
                    }
                }
        return result;
    }
}
