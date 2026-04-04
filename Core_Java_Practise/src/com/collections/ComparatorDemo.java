package com.collections;
import java.util.*;

class Student5 {
    int id;
    String name;

    Student5(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return id + "-" + name;
    }
}

public class ComparatorDemo {
    public static void main(String[] args) {

        List<Student5> list = new ArrayList<>();

        list.add(new Student5(3, "C"));
        list.add(new Student5(1, "A"));
        list.add(new Student5(2, "B"));

        // Sort by name
        Collections.sort(list, (a, b) -> a.name.compareTo(b.name));

        System.out.println("By Name: " + list);

        // Sort by id descending
        Collections.sort(list, (a, b) -> b.id - a.id);

        System.out.println("By ID Desc: " + list);
    }
}