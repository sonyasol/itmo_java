package org.itmo.lab6;

abstract class Person {
    private String name;
    private String surName;

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    abstract void printInfo();

    public Person(String n, String s) {
        this.name = n;
        this.surName = s;
    }
}
