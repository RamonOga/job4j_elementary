package src.ru.job4j.ex;

public class FindMaxLength {
    public static void main(String[] args) {
        String[] shops = {"Ebay", null, "Amazon", null, "Ozon"};
        int max = 0;
        for (int index = 0; index < shops.length; index++) {
            String el = shops[index];
            if (el == null) {
                System.out.println("Element number " + index +  " equal null");
            } else if (el.length() > max) {
                max = el.length();
            }
        }
        System.out.println("Max length : " + max);
    }
}
