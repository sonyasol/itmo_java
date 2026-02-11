package org.itmo.lab6.task4;

public class Child extends Parent {

    public Child(int number) {
        super(number);
    }

    public void printNumber() {
        System.out.println("Number is " + number);
    }
}
