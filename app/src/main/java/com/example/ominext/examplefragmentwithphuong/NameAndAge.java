package com.example.ominext.examplefragmentwithphuong;

/**
 * Created by Ominext on 7/12/2017.
 */

public class NameAndAge {
    private String name;
    private int age;

    public NameAndAge() {

    }

    public NameAndAge(String name, int age) {
        this.name = name;
        this.age = age;
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
}
