package ru.job4j.poly;

public class Train implements Vehicle {

    private String fuel = "Coal";

    @Override
    public void move() {
        System.out.println("I'am driving on rails!");
    }

    @Override
    public int load(int count) {
        System.out.println("My fuel is " + fuel);
        return count * 150;
    }
}

