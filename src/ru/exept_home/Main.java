package ru.exept_home;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        User[] users = {
                new User("admin", "admin", 11),
                new User("user", "user", 20),
                new User("manager", "manager", 20),
        };

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите логин");
        String userName = scanner.nextLine();
        System.out.println("Введите пароль");
        Integer userAge = scanner.nextInt();

        try {
            System.out.println(validateUser(users, userName));
        } catch (Exception e) {
            System.out.println("Exception " + e.getMessage());

        }

        // вторая часть

        for (Movie event: Movie.getMovies()) {
            validEvent(event);
        }
        for (Theatre event: Theatre.getTheatres()) {
            validEvent(event);
        }
        System.out.println("Все события корректны");

    }

    /**
     * Проверка, есть ли доступ у пользователя
     * @param users User[]
     * @param login String user name
     * @return String
     * @throws Exception Доступ не предоставлен или возраст < 18
     */
    public static String validateUser(User[] users, String login) throws Exception {
        for (User user : users) {
            if (user.getAge() < 18) {
                throw new AccessDeniedException("Возраст не подходит");
            } else if (user.getName().equals(login)) {
                return "Доступ предоставлен";
            }
        }
        throw new UserNotFoundExecption("Пользователь не найден");

    }

    /**
     *  Упадет на "Театр 1"
     * @param event событие
     */
    public static void validEvent(Event event){
        if (event.age == 0 || event.releaseYear == 0 || event.title == null){
            throw new RuntimeException("Что - то пришло в ноль");
        }
    }
}
