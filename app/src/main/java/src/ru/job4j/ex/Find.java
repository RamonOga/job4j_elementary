package src.ru.job4j.ex;

public class Find {
    public static String get(String[] data, int index) {
        if (index < 0 || index > data.length - 1) {
            throw new IllegalArgumentException("Index out of bound");
        }
        return data[index];
    }

    public static void main(String[] args) {
        String[] data = {"onw", "two", "three"};
        String rsl = Find.get(data, 3);
        System.out.println(rsl);
    }
}