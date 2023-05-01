package org.example.json;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Data
public class Person {
    private String name;

    private int age;

    private boolean isMarried;

    private List<String> hobbies;

    private List<String> children;
}

