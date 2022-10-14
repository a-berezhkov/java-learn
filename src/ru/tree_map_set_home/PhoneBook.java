package ru.tree_map_set_home;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class PhoneBook {
    private Map<LocalDateTime, String> missedCalls;
    private Map<String, Contact> contacts;

    public PhoneBook() {
        this.missedCalls = new TreeMap<>();
        this.contacts = new HashMap<>();
    }

    // TODO
    // добавляет контакт
    // добавляет пропущенные вызовы
    //печать
    // очистить

    /**
     * Добавление контактов
     *
     * @param contact Contact
     */
    public void addContact(Contact contact) {
        contacts.put(contact.getPhone(), contact);
    }

    /**
     * Добавление пропущенных звонков
     *
     * @param phone String
     */
    public void addMissedCall(String phone) {
        missedCalls.put(LocalDateTime.now(), phone);
    }

    /**
     * Очистка мапы
     */
    public void clear() {
        missedCalls.clear();

    }

    /**
     * @return String
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(missedCalls.size() * 64);
        // foreach нельзя, так как не коллекция.
        for (Map.Entry<LocalDateTime, String> entry : missedCalls.entrySet()) {
            sb
                    .append(entry.getKey())
                    .append(" - ")
                    .append(contacts.containsKey(entry.getValue()) ?
                            contacts.get(entry.getValue()).toString() : entry.getValue()
                    );
            sb.append("\n");
//            Contact targetContact = contacts.get(entry.getValue());
//            if (targetContact == null) {
//                sb.append(entry.getValue());
//            } else {
//                sb.append(targetContact.toString());
//            }
        }
        return sb.toString();
    }
}
