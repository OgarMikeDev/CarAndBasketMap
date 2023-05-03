package org.example.json;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Course {
    private String name;

    private int duration;


    @Override
    public String toString() {
        return "Name course: " + name +
                ", duration course: " + duration;
    }
}
