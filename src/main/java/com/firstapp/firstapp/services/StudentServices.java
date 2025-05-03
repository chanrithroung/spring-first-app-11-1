package com.firstapp.firstapp.services;
import com.firstapp.firstapp.entity.student.Student;
import com.firstapp.firstapp.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServices {
    final private StudentRepository studentRepository;
    // Constructor injection
    @Autowired
    StudentServices(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public void createStudent(Student student) {
        studentRepository.save(student);
    }

}
