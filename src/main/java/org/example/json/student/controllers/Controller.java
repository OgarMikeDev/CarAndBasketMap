package org.example.json.student.controllers;

import lombok.RequiredArgsConstructor;
import org.example.json.student.model.Student;
import org.example.json.student.repository.RepositoryStudents;
import org.example.json.student.request.Request;
import org.example.json.student.response.Response;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@org.springframework.stereotype.Controller
@RequiredArgsConstructor
@RestController
public class Controller {
    private final RepositoryStudents repositoryStudents;


    @RequestMapping(value = "/", method = RequestMethod.POST)
    public Response addStudent(@RequestBody Request request) {
        Student student = new Student();
        student.setFirstName(request.getFirstName());
        student.setLastName(request.getLastName());
        student.setAge(request.getAge());
        student.setCourses(request.getCourses());

        if (student.getFirstName() != null && student.getFirstName() != null) {
            repositoryStudents.save(student);
            return new Response(true);
        }
        return new Response(false);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Student getStudent(@PathVariable String id) {
        Student student = repositoryStudents.getStudentById(id);
        return student;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Student> getStudent() {
        List<Student> students = repositoryStudents.findAll();
        return students;
    }

    @PutMapping("/put/{id}")
    public Response updateDataStudent(@PathVariable String id, @RequestBody Request request) {
        Student student = repositoryStudents.getStudentById(id);
        student.setFirstName(request.getFirstName());
        student.setLastName(request.getLastName());
        student.setAge(request.getAge());
        student.setCourses(request.getCourses());

        if (student.getFirstName() != null && student.getFirstName() != null) {
            repositoryStudents.save(student);
            return new Response(true);
        }
        return new Response(false);
    }
}
