package src.ru.job4j.strategy;

public class Square implements Shape {

        @Override
        public String draw() {
            String ln = System.lineSeparator();
            return  " ________" + ln
                    + "|        |" + ln
                    + "|        |" + ln
                    + "|________|" + ln;
        }

        public static void main(String[] args) {
            System.out.println(new ru.job4j.strategy.Square().draw());
        }
}
