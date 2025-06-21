package src.ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User rsl = null;
        for (User user : users) {
            if (user.getUsername().equals(login)) {
                rsl = user;
                break;
            }
        }
        if (rsl == null) {
            throw new UserNotFoundException();
        } else {
            return rsl;
        }
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (user.isValid() && user.getUsername().length() > 3) {
            return true;
        } else {
            throw new UserInvalidException();
        }

    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", true)
        };
        try {
            User user = findUser(users, "Petr Arsentev");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException ie) {
            System.out.println("user not validate.");
        } catch (UserNotFoundException ne) {
            System.out.println("User not found.");

        }
    }
}