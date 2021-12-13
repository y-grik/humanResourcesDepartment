package com.company.entity;

public class Worker extends Employee{


    public Worker(int id, String name, int age, Gender gender, int rate) {
        super(id, name, age, gender, rate);
    }

    @Override
    public String toString() {
        String employeeData = super.toString();
        return "Worker" + employeeData;
    }



}
