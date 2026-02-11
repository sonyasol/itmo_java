package org.itmo.lab6;

class Client extends Person {
    private String bankName;

    @Override
    public void printInfo() {
        System.out.println("Клиент: " + getName() + " " + getSurName());
        System.out.println("Банк: " + bankName);
    }

    public Client(String name, String surName, String bankName) {
        super(name, surName);
        this.bankName = bankName;
    }
}
