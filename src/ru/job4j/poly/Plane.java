package ru.job4j.poly;

public class Plane implements Vehicle {

    private String fuel = "kerosene";

    @Override
    public void move() {
        System.out.println("I'am driving on sky!");
    }

    @Override
    public int load(int count) {
        System.out.println("My fuel is " + fuel);
        return 500 * count;
    }
}
