package ru.mycompany;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Person singer = new Singer("Petr", 80, 44);
        Person person = new Person("Petr", 40);


        System.out.println(getCovidDangerLavel(person));
        System.out.println(getCovidDangerLavel(singer));

        happyBirthdayParty(singer);
        happyBirthdayParty(person);


        //Matrix.makeMatrix();
        // XO.Enter();
//        int[][] arr = new int[5][];
//        int[][] arr2 = {{1, 2, 3, 4,}, {}, {1, 4, 5, 6}, {5, 5, 5,}};
//        arr2[0] = new int[5];
//        arr2[1] = new int[]{1,2};
//        arr2[2] = new int[0];
//        arr2[3] = new int[]{1,2,3,4,5,6};
//        arr2[4] = new int[]{1,2,3};
//        int[] x = arr2[2];
//        System.out.println(Arrays.deepToString(arr2));
//        //System.out.println(arr2[3][3]);
//        //arr2[3][3] = 44;
//        System.out.println(Arrays.deepToString(arr2));
//
//        for (int i = 0; i < arr2.length; i++) {
//            for (int j = 0; j < arr2[i].length; j++) {
//                System.out.print(arr2[i][j] + " ");
//            }
//            System.out.print("\n");
//        }
        //Weather.Temperature();
        //Basket.add();
    }

    public static String getCovidDangerLavel(Person person) {
        return person.getAge() < 75 ? "medium" : "high";
    }

    public static void happyBirthdayParty(Person person) {
        System.out.println("С днем рождени " + person.getName());
        person.happyBirthDay();
        System.out.println("Возраст" + person.getAge());


    }
}