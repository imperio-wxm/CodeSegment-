package com.wxmimperio.pojo;

import java.sql.Blob;
import java.sql.Clob;

/**
 * Created by wxmimperio on 2016/7/4.
 */
public class Student {
    private int id;
    private String name;
    private int age;
    private Grade grade;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }
}
