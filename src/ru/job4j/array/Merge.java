package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int countLeft = 0;
        int countRight = 0;
        int count = 0;

        while (countLeft < left.length && countRight < right.length) {
            if (left[countLeft] < right[countRight]) {
                rsl[count] = left[countLeft];
                countLeft++;
            } else {
                rsl[count] = right[countRight];
                countRight++;
            }
            count++;
        }

        while (countLeft != left.length) {
                rsl[count] = left[countLeft];
                count++;
                countLeft++;
        }
        while (countRight != right.length) {
                rsl[count] = right[countRight];
                count++;
                countRight++;
        }
        return rsl;
    }
}