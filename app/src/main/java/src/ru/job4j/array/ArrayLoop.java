package src.ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 2 + 3;
        }
        for (int ind: arr) {
            System.out.println(ind);
        }
    }

}
