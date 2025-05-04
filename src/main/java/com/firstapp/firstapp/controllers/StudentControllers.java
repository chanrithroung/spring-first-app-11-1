package com.firstapp.firstapp.controllers;
import com.firstapp.firstapp.entity.student.Student;
import com.firstapp.firstapp.services.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/student")
public class StudentControllers {
    private StudentServices studentServices;
    @Autowired
    public StudentControllers(StudentServices studentServices) {
        this.studentServices = studentServices;
        System.out.println("Here is constructor!");
    }

    @GetMapping
    List<Student> getStudents() {
        return studentServices.listStudent();
    }

    @PostMapping
    String createStudent(@RequestBody Student student) {
        return studentServices.createStudent(student);
    }
}
