package org.example.json;

import lombok.Data;

import java.util.List;

@Data
public class Student {
    private String firstName;

    private String lastName;

    private int age;

    private List<Course> courses;
}
