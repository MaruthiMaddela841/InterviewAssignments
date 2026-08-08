package com.streams;

public class EmployeeMinMax {
	int id;
    String name;
    int age;
    double salary;

    EmployeeMinMax(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return id + " " + name +
                " age=" + age +
                " salary=" + salary;
    }
}
