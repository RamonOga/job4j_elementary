package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void toGo() {
        System.out.println("Let's go!");
    }

    @Override
    public void passengers(int count) {
        System.out.println(count + " Passengers on the bus.");
    }

    @Override
    public int load(int count) {
        return count * 43;
    }
}
