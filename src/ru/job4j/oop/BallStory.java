package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Ball kolobok = new Ball();
        Hare here = new Hare();
        Wolf wolf = new Wolf();
        Fox fox = new Fox();
        here.tryEat(kolobok);
        kolobok.runAway(true);
        wolf.tryEat(kolobok);
        kolobok.runAway(true);
        fox.tryEat(kolobok);
        kolobok.runAway(false);

    }
}
