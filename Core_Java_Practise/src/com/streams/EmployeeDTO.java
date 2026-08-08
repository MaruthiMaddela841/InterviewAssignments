package com.streams;

class EmployeeDTO {

    String name;

    EmployeeDTO(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return name;
    }
}
