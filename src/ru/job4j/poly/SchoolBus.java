package ru.job4j.poly;

public class SchoolBus implements Vehicle {

    private String fuel = "gasoline";

    @Override
    public void move() {
        System.out.println("I'am driving on roads!");
    }

    @Override
    public int load(int count) {
        System.out.println("My fuel is " + fuel + " They plowed with such prices!!!");
        return count * 44;
    }
}
