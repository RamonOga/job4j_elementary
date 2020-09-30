package ru.job4j.oop;

public class Ball {
    public void runAway(boolean isTrue) {
        if (isTrue) {
            System.out.println("Ball escaped =) ");
        } else {
            System.out.println("Ball was eaten =(");
        }
    }
}
