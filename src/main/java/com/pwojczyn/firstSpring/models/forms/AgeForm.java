package com.pwojczyn.firstSpring.models.forms;

public class AgeForm {
    private int age;

    public AgeForm(int age) {
        this.age = age;
    }

    public AgeForm() {

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
