package org.itmo.lab6.task5;

public class Child extends Parent{
    public void getInfo() {
        System.out.println("Введите имя: ");
        String name = scanner.nextLine();
        System.out.println("Имя: " + name);
    }
}
