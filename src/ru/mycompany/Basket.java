package ru.mycompany;

import java.util.Scanner;

public class Basket {

    public static final String[] PRODUCT = {
            "Product 1",
            "Product 2",
            "Product 3",
            "Product 4",
            "Product 5",
    };
    public static final Double[] PRICE = {
            33.00, 22.5, 44.00, 55.00, 66.76
    };


    public static void add() {
        int[] buy =  new int[Basket.PRODUCT.length];

        System.out.println("Введите номер товара:");
        StringBuilder buid = new StringBuilder();
        for (int i = 0; i < Basket.PRODUCT.length; i++) {
            buid.append(i);
            buid.append(":");
            buid.append(Basket.PRODUCT[i]);
            buid.append("\n");
        }
        System.out.println(buid.toString());
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Введите номер продукта и количество через пробел или end");
            String input = scanner.nextLine();
            if(input.equals("end")){
                break;
            }
            String[] data = input.split(" ");
            int id = Integer.parseInt(data[0]);
            int count = Integer.parseInt(data[1]);
            buy[id] += count;
        }
        System.out.println("Товар     Количество    Цена за ед     Общая стоимость");
        double sum = 0.00;
        for (int i = 0; i < buy.length; i++) {
            if (buy[i] != 0){
                System.out.println(Basket.PRODUCT[i]);
                System.out.println(buy[i]);
                System.out.println(Basket.PRICE[i]);
                double perOne = buy[i] * Basket.PRICE[i];
                sum+=perOne;
                System.out.println(perOne);
            }
        }
        System.out.println("Итого" + sum);
    }

}
