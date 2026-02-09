package org.itmo.lab3;

public class Study {
    private String course;

    //конструктор принимает параметр cource
    public Study(String course) {
        this.course = course;
    }

    public String printCourse() {
        return this.course;
    }
}
