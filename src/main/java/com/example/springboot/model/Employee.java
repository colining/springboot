package com.example.springboot.model;

import lombok.Data;

/**
 * Created by colin on 2018/6/2.
 */
@Data
public class Employee {
    private int id;
    private String name;
    private int age;
    private String gender;

    public Employee(int id, String name, int age, String gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}
