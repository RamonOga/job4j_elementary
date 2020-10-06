package ru.job4j.poly;

public class Driving {
    public static void main(String[] args) {

        Vehicle plane = new Plane();
        Vehicle bus = new SchoolBus();
        Vehicle train = new Train();
        Vehicle[] vehicles = new Vehicle[]{plane, bus, train};
        for (Vehicle veh : vehicles) {
            System.out.println("=============");
            veh.move();
            veh.load(10);
            System.out.println("=============");
        }
    }
}
