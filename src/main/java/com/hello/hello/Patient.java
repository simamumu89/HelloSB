package com.hello.hello;

public class Patient {

    private int id;

    private String name;

    private int age;

    private String Profession;

    private String DiseaseName;

    public Patient(int id, String name, int age, String profession, String diseaseName) {
        this.id = id;
        this.name = name;
        this.age = age;
        Profession = profession;
        DiseaseName = diseaseName;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getProfession() {
        return Profession;
    }

    public String getDiseaseName() {
        return DiseaseName;
    }
}
