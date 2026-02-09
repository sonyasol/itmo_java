package org.itmo.lab3;

public class Car {
    private String color;
    private String name;
    private Double weight;
    
    public void printCarInfo() {
        System.out.println("Данные об автомобиле: цвет - " + color +
                ", название - " + name + ", вес - " + weight);
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getWeight() {
        return weight;
    }

    public Car(String color) {
        this.color = color;
    }

    public Car(String color, Double weight) {
        this.color = color;
        this.weight = weight;
    }
    public Car() {

    }
}
