package org.example.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class UseStudent {
    public static void main(String[] args) throws IOException {
        String json = Files.readString(Paths.get("student.json"));

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());

        Student student = objectMapper.readValue(json, Student.class);
        System.out.println(student.getFirstName() + " - " + student.getLastName() + " - " + student.getAge() + "\n"
                + student.getCourses());

    }
}
