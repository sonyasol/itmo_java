package org.itmo.lab1;

import java.util.Scanner;

public class Solution1 {
    public void print()
    {
        System.out.println("Я");
        System.out.println("хорошо");
        System.out.println("знаю");
        System.out.println("Java");
    }

    public void task2()
    {
        double a;
        int b;
        a = (46+10) * (double)10/3;
        b = 29 * 4 * (-15);
        System.out.println(a);
        System.out.println(b);
    }

    public void task3()
    {
        int number = 10500;
        double result = ((double)number / 10)/10;
        System.out.println(result);
    }

    public void task4()
    {
        double a = 3.6;
        double b = 4.1;
        double c = 5.9;
        double result = a * b * c;
        System.out.println(result);
    }

    public void task5()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите 3 числа");

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println("Эти числа вы ввели:");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    public void task6()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число b:");
        int b = scanner.nextInt();

        if (b % 2 != 0 && b < 100) {
            System.out.println("Нечетное");
        } else if (b % 2 == 0 && b < 100) {
            System.out.println("Четное");
        } else {
            System.out.println("Выход за пределы диапазона");
        }
    }
}
