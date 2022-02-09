package com.company;

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
