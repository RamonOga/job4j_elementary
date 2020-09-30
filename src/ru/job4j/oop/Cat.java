package ru.job4j.oop;

public class Cat {

    private String food;
    private String name;

    public void show() {
        System.out.println("There are gav's food: " + this.food);
        System.out.println("Name of this cat: " + this.name);
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public void giveNick(String nick) {
        this.name = nick;
    }

    public static void main(String[] args) {
        Cat gav = new Cat();
        Cat black = new Cat();
        gav.eat("kotleta");
        gav.giveNick("Gav");
        black.eat("fish");
        black.giveNick("Black Cat");
        gav.show();
        black.show();
    }
}
