package com.collections;
import java.util.*;

class Student4 implements Comparable<Student4> {
    int id;
    String name;

    Student4(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Natural ordering (by id)
    @Override
    public int compareTo(Student4 o) {
        return this.id - o.id;
    }

    @Override
    public String toString() {
        return id + "-" + name;
    }
}

public class ComparableDemo {
    public static void main(String[] args) {
        List<Student4> list = new ArrayList<>();

        list.add(new Student4(3, "C"));
        list.add(new Student4(1, "A"));
        list.add(new Student4(2, "B"));

        Collections.sort(list);

        System.out.println(list);
    }
}