package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Enter your question. The answer must be yes/no!");
        String question = scan.nextLine();
        int magic = random.nextInt(3);
        if (magic == 1) {
            System.out.println("The answer to your question: " + question + " Yes! ");
        } else if (magic == 2) {
            System.out.println("The answer to your question: " + question + " No! ");
        } else {
            System.out.println("The answer to your question: " + question + " May be.. ");
        }
    }
}
