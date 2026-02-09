package org.itmo.lab3;

public class JavaProgram {
    public static void main(String[] args) {
        Study study = new Study("Изучение Java - это просто!"); //объект класса Study
        System.out.println(study.printCourse()); //обращение к методу

        Car firstCar = new Car();
        firstCar.setName("BMW");
        firstCar.setColor("Черный");
        firstCar.setWeight(650.9);
        firstCar.printCarInfo();
        System.out.println(firstCar.getColor() + "_" + firstCar.getName() + "_" + firstCar.getWeight());

        Car secondCar = new Car();
        secondCar.setColor("Красный");
        secondCar.setName("Honda");
        secondCar.setWeight(800.9);
        secondCar.printCarInfo();

        Car carColor = new Car("Белый");
        carColor.printCarInfo();

        Car carColorWeight = new Car("Зеленый", 5600.5);
        carColorWeight.printCarInfo();

        House firstHouse = new House();
        firstHouse.setInfo(5, 2020, "Setl");
        firstHouse.printHouseInfo();
        System.out.println("Количество лет, прошедших с момента постройки дома: " + firstHouse.houseAge());

        House secondHouse = new House();
        secondHouse.setInfo(9, 1976, "Девятиэтажка");
        secondHouse.printHouseInfo();
        System.out.println("Количество лет, прошедших с момента постройки дома: " + secondHouse.houseAge());

        Tree firstTree = new Tree(100, "Дуб");
        Tree secondTree = new Tree(500, true, "Баобаб");
        Tree thirdTree =   new Tree();
    }
}
