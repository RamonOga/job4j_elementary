package src.ru.job4j.ex;

public class Fact {
    public static void main(String[] args) {

    }

    public int calc(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Dude, your number less then zero");
        }
        int rsl = 1;
        for (int index = 1; index <= n; index++) {
            rsl *= index;
        }
        return rsl;
    }
}