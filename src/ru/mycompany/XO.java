package ru.mycompany;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Крестики - нолики, упращенная версия
 */

public class XO {
    public final static int SIZE = 4;
    public final static char EMPTY = '-';
    public final static char X = 'X';
    public final static char O = 'O';

    public static void Enter() {
        char[][] pole = new char[SIZE][SIZE];
        for (int i = 0; i < pole.length; i++) {
            Arrays.fill(pole[i], EMPTY);
        }
        Scanner scanner = new Scanner(System.in);

        boolean isCrossTurn = true; // Ход крестиков
        while (true) {
            String playerName = isCrossTurn ? "крестики" : "нолики";
            char player = isCrossTurn ? X : O;

            System.out.println("Введите кооридинаты для" + playerName);
            printField(pole);
            String[] input = scanner.nextLine().trim().split(" ");
            int x = Integer.parseInt(input[0]) - 1;
            int y = Integer.parseInt(input[1]) - 1;
            if (pole[x][y] != EMPTY) {
                System.out.println("Не можем сюда пойти");
                continue;
            }

            pole[x][y] = player;

            if (isWin(pole, player)) {
                System.out.println("Победили " + player);
                break;
            }
            isCrossTurn = !isCrossTurn;
            System.out.print(Arrays.deepToString(pole));
        }
        printField(pole);
        System.out.println("Game over");


    }

    public static void printField(char[][] pole) {
        for (int i = 0; i < pole.length; i++) {
            for (int j = 0; j < pole[i].length; j++) {
                System.out.print(pole[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Функция определения победы
     *
     * @param pole   char[][]
     * @param player char
     * @return boolean
     */
    public static boolean isWin(char[][] pole, char player) {
        // Вычисление побед по горизонтали и вертикали
        int diagonal1 = 0;
        int diagonal2 = 0;
        for (int i = 0; i < SIZE; i++) {
            int rowNumber = 0;
            int colNumber = 0;
            for (int j = 0; j < SIZE; j++) {
                if (pole[i][j] == player) rowNumber++;
                if (pole[j][i] == player) colNumber++;
                if (i == j && pole[j][i] == player) diagonal1++;
                if (i + j == SIZE-1 && pole[j][i] == player) diagonal2++;
            }
            System.out.println(diagonal1);
            System.out.println(diagonal2);
            if (rowNumber == SIZE || colNumber == SIZE || diagonal1 == SIZE || diagonal2 == SIZE) {
                return true;
            }

        }

        return false;
    }
}
