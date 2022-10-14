package ru.hash_set_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Main {

    private static final Random rand = new Random();
    private static final Map<String, DriverLicense> STORAGE = new HashMap<>();

    public static void main(String[] args) {
//        Map<String,Integer> map = new HashMap<>();
//        map.put("123",123);
//        System.out.println(map);
        generateAndPutDriverLicense("Ivan", "A,B,C");
        generateAndPutDriverLicense("Kolya", "A,B,C,D");
        printStorage();




    }

    /**
     *
     * @param driverName
     * @param category
     * @return
     */
    private static DriverLicense generateAndPutDriverLicense(String driverName, String category) {
        String id = String.valueOf(rand.nextInt());
        STORAGE.put(id, new DriverLicense(id, category, driverName));
        return new DriverLicense(id, category, driverName);
    }

    private static void printStorage(){
        for (Map.Entry<String, DriverLicense> entry : STORAGE.entrySet()) {
            System.out.printf("%s -> %s\n", entry.getKey(), entry.getValue().toString());
        }
    }
}
