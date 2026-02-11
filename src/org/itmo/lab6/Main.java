package org.itmo.lab6;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException {
        Employee emp = new Employee("Vasya", "Vaskin", "VTB");
        emp.printInfo();

        Person emp2 = new Employee("Petya", "Prtkin", "Sber");
        emp2.printInfo();

        Person client = new Client("Sonya", "Sonina", "TBank");
        client.printInfo();

        Car truck = new Truck(50, "Lada", '3', 96.6f, 4, 600.5);
        truck.outPut();
    }
}
