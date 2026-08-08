package com.streams;

import java.util.Objects;

class EmployeeDistinct {

    int id;
    String name;
    String department;

    EmployeeDistinct(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    // Uncomment these methods and compare the output.

    @Override
    public boolean equals(Object obj) {

        if(this == obj)
            return true;

        if(obj == null || getClass() != obj.getClass())
            return false;

        EmployeeDistinct emp = (EmployeeDistinct)obj;

        return id == emp.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return id + " " + name + " " + department;
    }
}
