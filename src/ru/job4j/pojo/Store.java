package ru.job4j.pojo;

public class Store {
    public static void main(String[] args) {
        Product milk = new Product("milk", 50);
        Product beer = new Product("beer", 40);
        Product staff = new Product("Staff", 1200);
        Product[] prods = new Product[3];
        prods[0] = milk;
        prods[1] = beer;
        prods[2] = staff;
        for (Product prod: prods) {
            System.out.println(prod.getName() + " - " + prod.getCount());
        }
        System.out.println("Replace beer to Bread");
        Product bread = new Product("Bread", 35);
        prods[1] = bread;
        for (Product prod: prods) {
            System.out.println(prod.getName() + " - " + prod.getCount());
        }
        System.out.println("Shown only product.count > 1000");
        for (Product prod: prods) {
            if (prod.getCount() > 1000) {
                System.out.println(prod.getName() + " - " + prod.getCount());
            }
        }
    }
}
