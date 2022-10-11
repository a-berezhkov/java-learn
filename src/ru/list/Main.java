package ru.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String template = "Здравствуй, %s";

        UserProfile userProfile1 = new UserProfile("Иван1", "111@111.ru");
        UserProfile userProfile2 = new UserProfile("Иван2", "121@111.ru");
        UserProfile userProfile3 = new UserProfile("Иван3", "131@111.ru");


        List<UserProfile> userProfiles = new ArrayList<>();
        userProfiles.add(userProfile1);
        userProfiles.add(userProfile2);
        userProfiles.add(userProfile3);

        List<Mail> emailList = new ArrayList<>();

        for (UserProfile userProfile : userProfiles) {
            Mail email = new Mail(userProfile.getEmail(), userProfile.getName());
            emailList.add(email);
        }

        Iterator<Mail> emailListIterator = emailList.iterator();
        while (emailListIterator.hasNext()) {
            Mail email = emailListIterator.next();
            System.out.printf("%s\n\n", email);
        }

        // Вывод

        emailList.forEach(mail -> System.out.printf("%s\n\n", mail));

        emailList.stream()
                .filter(mail -> !mail.getEmail().equals(userProfile1.getEmail()))
                .forEach(mail -> System.out.printf("%s\n\n", mail));

        // Ловим эксепшион =)
        // Удалять через итератор
        System.out.println(emailList.size());
        for (Mail mail : emailList) {
            if (!mail.getEmail().equals(userProfile2.getEmail())) {
                emailList.remove(mail);
            }
        }
        System.out.println(emailList.size());


    }


}
