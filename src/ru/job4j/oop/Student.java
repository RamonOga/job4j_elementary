package ru.job4j.oop;

public class Student extends Object {
    public void song(String lyrics) {
        System.out.println("I can sign a song : " + lyrics);
    }

    public void music() {
        System.out.println("La la la");
    }

    public static void main(String[] args) {
        Student petya = new Student();
        String song = "I believe, I can fly";
        petya.song(song);
        petya.music();
        petya.song(song);
        petya.music();
        petya.song(song);
        petya.music();
    }
}
