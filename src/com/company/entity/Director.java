package com.company.entity;

public class Director extends Employee{


    public Director(int id, String name, int age, Gender gender, int rate) {
        super(id, name, age, gender, rate);
    }

    @Override
    public String toString() {
        String employeeData = super.toString();
        return "Director" + employeeData;
    }
}
