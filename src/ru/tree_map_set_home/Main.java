package ru.tree_map_set_home;


public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        System.out.println(phoneBook);

        addContacts(phoneBook);
        addMissedCalls(phoneBook);
        System.out.println(phoneBook.toString());
        System.out.println("Очищаем ");

        phoneBook.clear();
        System.out.println(phoneBook.toString());
    }

    private static void addContacts(PhoneBook phoneBook) {
        phoneBook.addContact(
                new Contact("11111111", "name1", "lname1", "first1" )
        );
        phoneBook.addContact(
                new Contact("222222222", "name2", "lname2", "first2" )
        );
        phoneBook.addContact(
                new Contact("3333333333", "name3", "lname3", "first3" )
        );
    }

    private static void addMissedCalls(PhoneBook phoneBook) {
        phoneBook.addMissedCall("9999999999999");
        phoneBook.addMissedCall("8888888888888");

        phoneBook.addMissedCall("222222222");

        phoneBook.addMissedCall("7777777777777");

    }


}
