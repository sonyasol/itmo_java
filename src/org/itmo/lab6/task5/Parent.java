package org.itmo.lab6.task5;

import java.util.Scanner;

public class Parent {
    protected Scanner scanner;

    public Parent() {
        scanner = new Scanner(System.in);
    }

    protected void getInfo() {
        System.out.println("Введите возраст:");
        int info = scanner.nextInt();
        System.out.println("Возраст: " + info);
    }
}
