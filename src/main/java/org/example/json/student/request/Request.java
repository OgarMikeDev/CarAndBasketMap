package org.example.json.student.request;

import lombok.Data;
import org.example.json.student.model.Course;

import java.util.List;

@Data
public class Request {
    private String firstName;

    private String lastName;

    private int age;

    private List<Course> courses;
}
