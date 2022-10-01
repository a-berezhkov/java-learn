package ru.mycompany;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Расчет средней температуре по дате
 */
public class Weather {

    public static void Temperature() {
        int[] temp = new int[31];
        boolean[] isEnter = new boolean[31];

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите день темпертуру или интер");
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            String[] parts = input.split(" ");
            int dat = Integer.parseInt(parts[0]) - 1;
            int t = Integer.parseInt(parts[1]);
            temp[dat] = t;
            isEnter[dat] = true;

            double sum = 0; // что бы получит дробное число
            for (int temperature : temp) {
                sum += temperature;
            }

            int count = 0;
            for (boolean i : isEnter) {
                if (i) count++;

            }
            double medium = sum / count;
            System.out.println("Средняя температура " + medium);


        }

    }
}
