package org.itmo.lab6;

class Employee extends Person {
    private String bankName;

    @Override
    public void printInfo() {
        System.out.println("Сотрудник: " + getName() + " " + getSurName());
        System.out.println("Банк: " + bankName);
    }

    public Employee(String name, String surName, String bankName) {
        super(name, surName);
        this.bankName = bankName;
    }

}
