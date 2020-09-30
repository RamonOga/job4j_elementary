package ru.job4j.oop;

public class Battery {
    int load;

    public Battery(int start) {
        this.load = start;
    }

    public void exchange(Battery batt) {
        batt.load += this.load;
        this.load = 0;
    }

    public static void main(String[] args) {
        Battery apple = new Battery(10);
        Battery dontApple = new Battery(91);
        System.out.println(apple.load);
        System.out.println(dontApple.load);
        apple.exchange(dontApple);
        System.out.println(apple.load);
        System.out.println(dontApple.load);

    }

}
