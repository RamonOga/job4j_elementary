package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surmanes = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];
        System.out.println("The size of the array ages = " + ages.length);
        System.out.println("The size of the array surmanes = " + surmanes.length);
        System.out.println("The size of the array prices = " + prices.length);
        names[0] = "Ivan";
        names[1] = "Lavrentyi";
        names[2] = "Fred";
        names[3] = "Karl";
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);

        }
    }

}
