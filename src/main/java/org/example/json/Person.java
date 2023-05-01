package org.example.json;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
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

