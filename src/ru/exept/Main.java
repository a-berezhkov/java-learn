package ru.exept;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) {
        method1();
    }

    private static void method1() {
        try {
            method2();
        } catch (CustomException exception) {
            System.out.println("Поймали");
            System.out.println(exception.getMessage());
            System.out.println(exception.getClass().getSimpleName());
            exception.getStackTrace();
            System.out.println(exception.getCause());
            return;
        } finally {
            System.out.println("Finally!");
        }
        System.out.println("В конце метода");

    }

    private static void method2() throws CustomException {
        method3();
    }

    private static void method3() throws CustomException {
        method4();
    }

    private static void method4() throws CustomException {
        throw new CustomException("Исключение в 4ом методе", new FileNotFoundException("Мы не проходили файлы =)"));
    }

}
