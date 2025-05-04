package com.firstapp.firstapp.services;
import com.firstapp.firstapp.entity.student.Student;
import java.util.List;

public interface StudentServices {
    List<Student> listStudent();
    String createStudent(Student student);
}
