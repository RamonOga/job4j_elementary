package src.ru.job4j.condition;

public class MultipleSwitchWeek {
    public int numberOfDay(String name) {
       return switch (name) {
            case "Понедельник", "Monday" -> 1;
            case "Втоник", "Tuesday" -> 2;
            case "Среда", "Wednesday" -> 3;
            case "Четверг", "Thursday" -> 4;
           case "Пятница", "Friday" -> 5;
           case "Суббота", "Saturday" -> 6;
           case "Воскресенье", "Sunday" -> 7;
            default -> -1;
        };
    }
}