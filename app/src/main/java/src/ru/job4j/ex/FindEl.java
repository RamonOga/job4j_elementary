package src.ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (value[i].equals(key)) {
                rsl = i;
                break;
            }

            if (rsl == -1) {
                throw new ElementNotFoundException();
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        String[] array = {"qwe", "eqw"};
        try {
            indexOf(array, "1231");
        } catch (ElementNotFoundException e) {
            e.fillInStackTrace();
        }
    }
}
