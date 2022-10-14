package ru.hash_set_map_home;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<Contact> l1 = new ArrayList<>();
        l1.add(new Contact("Контакт 11", "999999999", 1));
        l1.add(new Contact("Контакт 12", "999999999", 2));



        List<Contact> l2 = new ArrayList<>();
        l2.add(new Contact("Контакт 21", "999999999", 3));
        l2.add(new Contact("Контакт 22", "999999999", 4));


        PhoneBook phoneBook1 = new PhoneBook(l1, "Group1");
        PhoneBook phoneBook2 = new PhoneBook(l2, "Group2"); // added

        PhoneBook.print(); // Мяукнули все котики класса =)


    }
}
