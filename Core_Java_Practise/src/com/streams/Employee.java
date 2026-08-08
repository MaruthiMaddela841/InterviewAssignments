package com.streams;

class Employee {

    int id;
    String name;
    int age;
    double salary;
    String department;

    Employee(int id, String name, int age, double salary, String department) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + age + " " + salary + " " + department;
    }
}
