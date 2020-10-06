package ru.job4j.io.gameeleven;

public class Eleven {
    private int matches = 11;

    public void getMatches(String name, int count) {
        boolean check = count <= 3 && count > 0;
        if (check) {
           this.matches -= count;
            System.out.println("Matches left : " + this.matches);
        }

        if (!checkMatches()) {
            System.out.println("Player " + name + " is win!");
        }
    }

    public boolean checkMatches() {
        return this.matches > 0;
    }
}
