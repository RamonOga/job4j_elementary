package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        String temp = "";
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
               // int point = index; Не понял как это использовать.
                for (int j = index + 1; j < array.length; j++) {
                   if (array[j] != null) {
                      temp = array[index];
                      array[index] = array[j];
                      array[j] = temp;
                      break;
                   }
                }
            }
            System.out.print(array[index] + " ");
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}