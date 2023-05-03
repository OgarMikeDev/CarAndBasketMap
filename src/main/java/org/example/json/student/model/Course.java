package org.example.json.student.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    private String name;

    private int duration;


    @Override
    public String toString() {
        return "Name course: " + name +
                ", duration course: " + duration;
    }
}
