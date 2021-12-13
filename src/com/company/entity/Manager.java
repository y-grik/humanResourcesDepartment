package com.company.entity;

public class Manager extends Employee{


    public Manager(int id, String name, int age, Gender gender, int rate) {
        super(id, name, age, gender, rate);
    }

    @Override
    public String toString() {
        String employeeData = super.toString();
        return "Manager" + employeeData;
    }

}
