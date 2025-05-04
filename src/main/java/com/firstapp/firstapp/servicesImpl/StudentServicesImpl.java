package com.firstapp.firstapp.servicesImpl;
import com.firstapp.firstapp.entity.student.Student;
import com.firstapp.firstapp.repositories.StudentRepository;
import com.firstapp.firstapp.services.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServicesImpl implements StudentServices {

    private StudentRepository studentRepository;
    @Autowired
    StudentServicesImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> listStudent() {
        return studentRepository.findAll();
    }

    @Override
    public String createStudent(Student student) {
        studentRepository.save(student);
        return "Student saved in database success";
    }
}
