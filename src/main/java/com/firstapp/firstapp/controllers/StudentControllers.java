package com.firstapp.firstapp.controllers;
import com.firstapp.firstapp.entity.student.Student;
import com.firstapp.firstapp.services.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentControllers {

    final StudentServices studentServices;

    @Autowired
    StudentControllers(StudentServices studentServices) {
        this.studentServices = studentServices;
    }

    @GetMapping
    List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Hong", "Male"));
        students.add(new Student(2, "Kimchhay", "Male"));
        return students;
    }

    @PostMapping
    String createStudent(@RequestBody Student student) {
        studentServices.createStudent(student);
        return "Student created successfully!";
    }
}
