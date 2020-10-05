package ru.job4j.pojo;

public class ShopDrop {
    public static Product[] leftShift(Product[] products, int index) {
        products[index] = null;
        Product help;
        for (int i = index; i < products.length - 1; i++) {
            help = products[i + 1];
            products[i + 1] = products[i];
            products[i] = help;
        }
        return products;
    }
}

