package org.itmo.lab3;

import java.time.Year;

public class House {
    private Integer floors;
    private Integer year;
    private String name;

    public void setInfo(Integer floors, Integer year, String name) {
        this.floors = floors;
        this.year = year;
        this.name = name;
    }

    public void printHouseInfo() {
        System.out.println("В доме " + name + " " + year + " года постройки " + floors + " этажей");
    }

    public int houseAge() {
        int currentYear = Year.now().getValue();
        int age = currentYear - year;
        return age;
    }
}
