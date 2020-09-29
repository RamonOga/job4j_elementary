package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int countL = 0;
        int countR = 0;
        int count = 0;
        for (int i = 0; i < rsl.length; i++) {
            if (countL < left.length && countR < right.length) {
                if (left[countL] < right[countR]) {
                    rsl[count] = left[countL];
                    countL++;
                } else {
                    rsl[count] = right[countR];
                    countR++;
                }
                count++;
            } else if (countL != left.length) {
                rsl[count] = left[countL];
                count++;
                countL++;
            } else if (countR != right.length) {
                rsl[count] = right[countR];
                count++;
                countR++;
            }
        }
        return rsl;
    }
}