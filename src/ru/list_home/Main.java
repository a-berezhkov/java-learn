package ru.list_home;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> taskList = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);


        Boolean isRun = true;
        while (isRun) {
            System.out.println("Выберите действие:");
            System.out.print(getMenu());
            int task = Integer.parseInt(scanner.nextLine());
            System.out.println("Вы ввели" + task);
            switch (task) {
                case 0:
                    System.out.println("Выполнен выход");
                    isRun = false;
                    break;
                case 1: {
                    System.out.println("Введите название задачи: ");
                    String answer = scanner.nextLine();
                    taskList.add(answer);
                    break;
                }
                case 2:
                    System.out.println("Список задач: ");
                    showTasks(taskList);
                    break;
                case 3:
                    int answer = Integer.parseInt(scanner.nextLine());
                    String deletedElem = taskList.remove(answer);
                    System.out.println("Элемент " + deletedElem + " удален");
                default:
                    System.out.println("Нет такого пункта");
                    break;
            }
        }


    }

    /**
     * Меню для задачи
     *
     * @return String
     */
    public static String getMenu() {
        StringBuilder str = new StringBuilder();
        str.append("1. Добавить задачу\n");
        str.append("2. Вывести список задач\n");
        str.append("3. Удалить задачу\n");
        str.append("0. Выход\n");
        return str.toString();
    }

    public static void showTasks(ArrayList<String> taskList) {
        for (int i = 0; i < taskList.size(); i++) {
            System.out.println(i + ". " + taskList.get(i));
        }
    }


}
