package com.streams;

import java.util.List;

public class EmployeeFlatMap {
	int id;
    String name;
    List<String> skills;

    EmployeeFlatMap(int id, String name, List<String> skills) {
        this.id = id;
        this.name = name;
        this.skills = skills;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + skills;
    }
}
