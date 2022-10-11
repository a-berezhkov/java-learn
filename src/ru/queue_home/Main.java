package ru.queue_home;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    private int countFlat = 25;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> order = new LinkedList<>();

        while (true) {
            System.out.println("Ожидаю ввода этажа: (для завершения введите 0)");
            int num = sc.nextInt();
            if (num == 0) break;
            if (num > 25) continue;
            order.offer(num);
        }
        System.out.println(order);
        while (order.peek() != null) {
            System.out.print(order.poll());
            System.out.print("---->");
        }

    }
}
