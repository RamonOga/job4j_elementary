package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book[] books = new Book[4];
        books[0] = new Book("First head Java", 717);
        books[1] = new Book("Clean code", 514);
        books[2] = new Book("Hard to Be a God", 467);
        books[3] = new Book("picnic on the side of the road", 323);

        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getName() + " - Pages - " + books[i].getQuantity());
        }

        Book help = books[0];
        books[0] = books[3];
        books[3] = help;
        System.out.println("====>Replacement<====");

        for (Book book : books) {
            System.out.println(book.getName() + " - Pages - " + book.getQuantity());
        }

        System.out.println(" Books with name \"Clean code\" : ");
        for (Book book : books) {
            if (book.getName().equals("Clean code")) {
                System.out.println(book.getName() + " - Pages - " + book.getQuantity());
            }
        }

    }
}
