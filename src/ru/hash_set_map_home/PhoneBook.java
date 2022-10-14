package ru.hash_set_map_home;

import ru.hash_set_map.DriverLicense;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {

    private static final Map<String, List<Contact>> MAP_CONTACTS = new HashMap<>();

    public PhoneBook(List<Contact> contacts, String nameGroup) {
        MAP_CONTACTS.put(nameGroup, contacts);
    }


    public static void print() {
        for (Map.Entry<String, List<Contact>> entry : MAP_CONTACTS.entrySet()) {
            for (Contact contact : entry.getValue()
            ) {
                System.out.printf("%s -> %s \n", entry.getKey(), contact.getName());
            }


        }
    }
}
