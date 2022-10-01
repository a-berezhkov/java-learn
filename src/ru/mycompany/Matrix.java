package ru.mycompany;

import java.util.Random;
import java.util.Scanner;

/**
 * Задание на поворот матрицы 8 на 8 на 90/180/270
 */
public class Matrix {

    public static int SIZE = 8;

    public static void makeMatrix() {
        int[][] colors = new int[SIZE][SIZE];

        Random random = new Random();
        for (int i = 0; i < colors.length; i++) {
            for (int j = 0; j < colors[i].length; j++) {
                colors[i][j] = random.nextInt(256);
            }
        }
        showMatrix(colors);
        String message = "Введите, на сколько повернуть матрицу: \n" +
                "90: на 90 \n" +
                "180: на 180 \n" +
                "270: на 270 \n";
        System.out.println(message);

        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        switch (input) {
            case 90:
                revert90(colors);
                break;
            case 180:
                revert180(colors);
                break;
            case 270:
                revert270(colors);
                break;
            default:
                System.out.println("Что - то пошло не так, введите 90/180/270");
        }


    }

    /**
     * Отображения матрицы
     *
     * @param matrix
     */
    public static void showMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    /**
     * @param matrix int [][]
     */
    public static void revert90(int[][] matrix) {
        int[][] routeMatrix = new int[SIZE][SIZE];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                routeMatrix[j][7 - i] = matrix[i][j];
            }

        }
        System.out.println("Матрица повернута на 90 градусов");
        showMatrix(routeMatrix);
    }

    /**
     * @param matrix int [][]
     */
    public static void revert180(int[][] matrix) {
        int[][] routeMatrix = new int[SIZE][SIZE];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                routeMatrix[7 - i][7 - j] = matrix[i][j];
            }

        }
        System.out.println("Матрица повернута на 90 градусов");
        showMatrix(routeMatrix);
    }

    /**
     * @param matrix int [][]
     */
    public static void revert270(int[][] matrix) {
        int[][] routeMatrix = new int[SIZE][SIZE];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                routeMatrix[7 - i][j] = matrix[i][j];
            }

        }
        System.out.println("Матрица повернута на 270 градусов");
        showMatrix(routeMatrix);
    }
}
