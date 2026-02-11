package org.itmo.lab6;

public class Truck extends Car {
    private int wheels;
    private double maxWeight;

    public void newWheels(int w) {
        this.wheels = w;
        System.out.println("Изменено количество колес: " + w);
    }

    public Truck(int weight, String model, char color, float speed, int wheels, double maxWeight) {
        super(weight, model, color, speed);
        this.wheels = wheels;
        this.maxWeight = maxWeight;
    }
}
