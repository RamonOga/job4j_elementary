package ru.job4j.array;

public class SkipNegative {
    public static int[][] skip1(int[][] array) {
       for (int[] row : array) {
           for (int i = 0; i < row.length; i++) {
               row[i] = row[i] < 0 ? 0 : row[i];
           }
       }
        return array;
    }

    public static int[][] skip2(int[][] array) {
        for (int row = 0; row < array.length; row++) {
            for (int cell = 0; cell < array[0].length; cell++) {
               array[row][cell] = array[row][cell] < 0 ? 0 : array[row][cell];
            }
        }
        return array;
    }
}



