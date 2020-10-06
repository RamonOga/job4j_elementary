package ru.job4j.io.gameeleven;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Eleven game = new Eleven();
        Scanner scan = new Scanner(System.in);
        int matches1;
        int matches2;
        System.out.println("Enter name first players : ");
        String name1 = scan.nextLine();
        System.out.println("Enter name second players : ");
        String name2 = scan.nextLine();

        while (game.checkMatches()) {
            System.out.println(name1 + ", take matches from 1 to 3");
            matches1 = Integer.parseInt(scan.nextLine());
            game.getMatches(name1, matches1);
            if (game.checkMatches()) {
                System.out.println(name2 + ", take matches from 1 to 3");
                matches2 = Integer.parseInt(scan.nextLine());
                game.getMatches(name2, matches2);
            }
        }
    }
}
