package com.lakusta.tasks;

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1)
        System.out.println("Завдання 1:");
        System.out.println(
                "Your time is limited,\nso don’t waste it\nliving someone else’s life\nSteve Jobs");

        // 2)
        System.out.println("Завдання 2:");
        System.out.println("Введіть значення:");
        double value = scanner.nextDouble();
        System.out.println("Введіть відсоток:");
        double percent = scanner.nextDouble();
        double result = (value * percent) / 100;
        System.out.println(percent + "% від " + value + " = " + result);

        // 3)
        System.out.println("Завдання 3:");
        System.out.println("Введіть три числа:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        String combinedNumber = "" + num1 + num2 + num3;
        System.out.println("Результат: " + combinedNumber);

        // 4)
        System.out.println("Завдання 4:");
        System.out.println("Введіть шестизначне число:");
        String sixDigitNumber = scanner.next();
        if (sixDigitNumber.length() != 6) {
            System.out.println("Помилка: введене число не є шестизначним.");
        } else {
            char[] digits = sixDigitNumber.toCharArray();
            char temp1 = digits[0];
            char temp2 = digits[1];
            digits[0] = digits[5];
            digits[1] = digits[4];
            digits[5] = temp1;
            digits[4] = temp2;
            System.out.println("Перетворене число: " + new String(digits));
        }

        // 5)
        System.out.println("Завдання 5:");
        System.out.println("Введіть номер місяця (1-12):");
        int month = scanner.nextInt();
        if (month < 1 || month > 12) {
            System.out.println("Помилка: введене значення не в діапазоні від 1 до 12.");
        } else {
            switch (month) {
                case 12:
                case 1:
                case 2:
                    System.out.println("Winter");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("Spring");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("Summer");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("Autumn");
                    break;
            }
        }

        // 6)
        System.out.println("Завдання 6:");
        System.out.println("Введіть кількість метрів:");
        double meters = scanner.nextDouble();
        System.out.println("Оберіть одиницю для конвертації (1 - милі, 2 - дюйми, 3 - ярди):");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                double miles = meters / 1609.34;
                System.out.println(meters + " метрів = " + miles + " миль");
                break;
            case 2:
                double inches = meters * 39.3701;
                System.out.println(meters + " метрів = " + inches + " дюймів");
                break;
            case 3:
                double yards = meters * 1.09361;
                System.out.println(meters + " метрів = " + yards + " ярдів");
                break;
            default:
                System.out.println("Помилка: невірний вибір.");
        }

        // 7)
        System.out.println("Завдання 7:");
        System.out.println("Введіть перше число:");
        num1 = scanner.nextInt();
        System.out.println("Введіть друге число:");
        num2 = scanner.nextInt();
        int start = Math.min(num1, num2);
        int end = Math.max(num1, num2);
        System.out.println("Непарні числа в діапазоні від " + start + " до " + end + ":");
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        // 8)
        System.out.println("Завдання 8:");
        System.out.println("Введіть початкове число діапазону:");
        int rangeStart = scanner.nextInt();
        System.out.println("Введіть кінцеве число діапазону:");
        int rangeEnd = scanner.nextInt();
        for (int i = rangeStart; i <= rangeEnd; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i + "*" + j + " = " + (i * j) + " ");
            }
            System.out.println();
        }

        // 9)
        System.out.println("Завдання 9:");
        int[] array = new int[20];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] =
                    rand.nextInt(200) - 100; // Заповнюємо масив випадковими числами від -100 до 99
        }
        int min = array[0];
        int max = array[0];
        int negativeCount = 0;
        int positiveCount = 0;
        int zeroCount = 0;
        for (int num : array) {
            if (num < min)
                min = num;
            if (num > max)
                max = num;
            if (num < 0)
                negativeCount++;
            if (num > 0)
                positiveCount++;
            if (num == 0)
                zeroCount++;
        }
        System.out.println("Мінімальне значення: " + min);
        System.out.println("Максимальне значення: " + max);
        System.out.println("Кількість від'ємних значень: " + negativeCount);
        System.out.println("Кількість додатних значень: " + positiveCount);
        System.out.println("Кількість нулів: " + zeroCount);

        // 10)
        System.out.println("Завдання 10:");
        List<Integer> evenNumbers = new ArrayList<>();
        List<Integer> oddNumbers = new ArrayList<>();
        List<Integer> negativeNumbers = new ArrayList<>();
        List<Integer> positiveNumbers = new ArrayList<>();
        for (int num : array) {
            if (num % 2 == 0)
                evenNumbers.add(num);
            if (num % 2 != 0)
                oddNumbers.add(num);
            if (num < 0)
                negativeNumbers.add(num);
            if (num > 0)
                positiveNumbers.add(num);
        }
        System.out.println("Парні числа: " + evenNumbers);
        System.out.println("Непарні числа: " + oddNumbers);
        System.out.println("Від'ємні числа: " + negativeNumbers);
        System.out.println("Додатні числа: " + positiveNumbers);

        // 11)
        System.out.println("Завдання 11:");
        drawLine(5, 'v', '*');
        drawLine(10, 'h', '#');

        // 12)
        System.out.println("Завдання 12:");
        int[] sortArray = {5, 2, 9, 1, 5, 6};
        System.out.println(
                "Введіть 'asc' для сортування за зростанням або 'desc' для сортування за спаданням:");
        String order = scanner.next();
        sortArray(sortArray, order);
        System.out.println("Відсортований масив: " + Arrays.toString(sortArray));
    }

    public static void drawLine(int length, char direction, char symbol) {
        if (direction == 'v') {
            for (int i = 0; i < length; i++) {
                System.out.println(symbol);
            }
        } else if (direction == 'h') {
            for (int i = 0; i < length; i++) {
                System.out.print(symbol);
            }
            System.out.println();
        } else {
            System.out.println(
                    "Невірний напрямок. Використовуйте 'v' для вертикальної або 'h' для горизонтальної лінії.");
        }
    }

    public static void sortArray(int[] array, String order) {
        if (order.equals("asc")) {
            Arrays.sort(array);
        } else if (order.equals("desc")) {
            Arrays.sort(array);
            for (int i = 0; i < array.length / 2; i++) {
                int temp = array[i];
                array[i] = array[array.length - i - 1];
                array[array.length - i - 1] = temp;
            }
        } else {
            System.out.println(
                    "Невірний вибір. Використовуйте 'asc' для зростання або 'desc' для спадання.");
        }
    }
}