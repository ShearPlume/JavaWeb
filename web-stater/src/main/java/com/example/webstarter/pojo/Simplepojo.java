package com.example.webstarter.pojo;

import java.util.Arrays;

public class Simplepojo {
     String name;
    Integer age;

    Address add;

    String [] hobby;

    @Override
    public String toString() {
        return "Simplepojo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", add=" + add +
                ", hobby=" + Arrays.toString(hobby) +
                '}';
    }

    public String[] getHobby() {
        return hobby;
    }

    public void setHobby(String[] hobby) {
        this.hobby = hobby;
    }

    public Address getAdd() {
        return add;
    }

    public void setAdd(Address add) {
        this.add = add;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


}
