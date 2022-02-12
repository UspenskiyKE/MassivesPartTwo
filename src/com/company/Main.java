package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        int[] arr = generateRandomArray();
        float totalSumMonth = 0f; //Чтобы использовать в Задаче 3 для расчета средней траты, задал тип float
        //Для  проверки результата в цикле выведу на печать каждый элемент
        for (int i = 1; i < arr.length; i++) {
            System.out.println(arr[i]);
            totalSumMonth += arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + totalSumMonth + " рублей");
        System.out.println();

        //Задача 2
        System.out.println("Задача 2");
        int minTrata = arr[0];
        int maxTrata = arr[0];
        //Поиск минимальной траты за месяц
        for (int i = 0; i < arr.length; i++) {

            if (minTrata > arr[i]) {
                minTrata = arr[i];
            }
        }
        //Поиск максимальной траты за месяц
        for (int i = 0; i < arr.length; i++) {

            if (maxTrata < arr[i]) {
                maxTrata = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minTrata + " рублей. Максимальная сумма трат за день составила " + maxTrata + " рублей");
        System.out.println();

        //Задача 3
        System.out.println("Задача 3");
        float sredArifm = totalSumMonth / 30;
        System.out.println("Средняя сумма трат за месяц составила " + sredArifm + " рублей");
        System.out.println();

        //Задача 4
        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        String FullName = "";
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            FullName += reverseFullName[i];
        }
        System.out.println(FullName);
        System.out.println();

        //Задачи повышенной сложности

        //Задача 5
        System.out.println("Задача 5");
        int[][] matrix = new int[3][3];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i == j) {
                    matrix[i][j] = 1;
                }

                if (j == matrix.length - 1 - i) {
                    matrix[i][j] = 1;
                }
            }
        }
        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }

        System.out.println();

        //Задача 6
        System.out.println("Задача 6");
        int[] firstMassive = {5, 4, 3, 2, 1};
        int[] secondMassive = new int[5];
        for (int i = firstMassive.length - 1; i >= 0; i--) {
            secondMassive[secondMassive.length - 1 - i] = firstMassive[i];
        }
        System.out.println(Arrays.toString(firstMassive));
        System.out.println(Arrays.toString(secondMassive));
        System.out.println();

        //Задача 7
        System.out.println("Задача 7");
        int[] firstMassive2 = {5, 8, 2, 3, 9};
        int invert;
        int buf;

        System.out.println(Arrays.toString(firstMassive2));
        for (int i = 0; i < firstMassive2.length; i++) {
            invert = firstMassive2.length - 1 - i;
            if (invert >= i) {
                buf = firstMassive2[i];
                firstMassive2[i] = firstMassive2[i] * firstMassive2[invert] / firstMassive2[i];
                firstMassive2[invert] = buf;
            }
        }
        System.out.println(Arrays.toString(firstMassive2));
        System.out.println();

        //Задача 8
        //Выводятся все пары чисел, сумма  которых равна -2, считая, что все значения в массиве уникальны
        System.out.println("Задача 8");
        int[] chisla = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        int s;
        int r;
        System.out.println(Arrays.toString(chisla));
        for (int i = 0; i < chisla.length - 1; i++) {
            r = i + 1;
            while (r < chisla.length) {
                s = chisla[i] + chisla[r];
                if (s == -2) {
                    System.out.println(chisla[i] + " " + chisla[r]);
                }
                r++;
            }
        }
        System.out.println();

        //Задача 9
        //Здесь также выводятся пары чисел, сумма которых равна -2
        //Но теперь программа работает и в случае, если в массиве есть дубликаты
        //И выводит только уникальные пары чисел
        System.out.println("Задача 9");
        int[] chisla2 = {-6, -5, 5, -8, 3, 2, 3, -4, 12, -5};
        int s2;
        int r2;
        System.out.println(Arrays.toString(chisla2));
        Arrays.sort(chisla2);

        for (int i = 0; i < chisla2.length - 1; i++) {
            r2 = i + 1;
            while (r2 < chisla2.length) {
                s2 = chisla2[i] + chisla2[r2];
                if (s2 == -2 && (chisla2[i + 1] != chisla2[i] && chisla2[r2 + 1] != chisla2[r2])) {
                    System.out.println(chisla2[i] + " " + chisla2[r2]);
                }
                r2++;
            }
        }
        System.out.println();
    }


    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}
