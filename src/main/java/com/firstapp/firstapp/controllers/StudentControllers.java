package com.firstapp.firstapp.controllers;
import com.firstapp.firstapp.entity.student.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentControllers {
    @GetMapping
    List<Student> getStudents() {
//        List<Student> students = new ArrayList<>(List.of(
//                new Student(1, "chanrith", "Male"),
//                new Student(2, "Cheata", "Female")
//        ));
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Hong", "Male"));
        students.add(new Student(2, "Kimchhay", "Male"));
        return students;
    }
}
