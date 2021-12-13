package com.company.entity;

public abstract class Employee {

    private int id;
    private String name;
    private int age;
    private Gender gender;
    private int rate;

    protected Employee(int id, String name, int age, Gender gender, int rate) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.rate = rate;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", rate=" + rate +
                '}';
    }
}
