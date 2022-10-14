package ru.tree_map_set;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        // 1
        //Map<String, Student> storage = new TreeMap<>();
        //2
        NavigableMap<String, Student> storage = new TreeMap<>();
        // TreeMap отсортирует автоматом по ключу
        storage.put("Иванов1", new Student("Иван1", "Ivanov1", "info1"));
        storage.put("Яванов2", new Student("Иван2", "Avanov2", "info2"));

        storage.put("Авано3", new Student("Иван3", "Bvanov3", "info3"));

        // 1
        //  printStudents(storage);


       // printStudents(storage.tailMap("Иванов1", true)); // Need interface navigable/sorted https://docs.oracle.com/javase/7/docs/api/java/util/TreeMap.html#tailMap(K)
       //  printStudents(storage.subMap("Авано3", true, "Иванов1", false));
        System.out.println(storage.floorKey("Колесов")); // Иванов1 - ближайший

    }

    private static void printStudents(Map<String, Student> storage) {
        // в цикле только коллекция, а map не является коллекцией!
        for (Map.Entry<String, Student> entry : storage.entrySet()) {
            System.out.println(entry.getValue());
        }
    }
}
