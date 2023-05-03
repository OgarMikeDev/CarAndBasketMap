package org.example.json.employee;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class Person {
    private String name;

    private int age;

    private boolean married;

    private List<String> hobbies;

    private List<String> children;

    private Car car;

    private Job job;
}

