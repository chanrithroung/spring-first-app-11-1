package com.firstapp.firstapp.servicesImpl;
import com.firstapp.firstapp.dto.StudentRequestDto;
import com.firstapp.firstapp.dto.StudentResponseDto;
import com.firstapp.firstapp.entity.student.Student;
import com.firstapp.firstapp.mapper.StudentMapper;
import com.firstapp.firstapp.repositories.StudentRepository;
import com.firstapp.firstapp.services.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class StudentServicesImpl implements StudentServices {
    private StudentRepository studentRepository;
    @Autowired
    StudentServicesImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<StudentResponseDto> listStudent() {
        List<Student> students = studentRepository.findAll();
        List<StudentResponseDto> studentResponseDtoList = new ArrayList<>();
        students.forEach( student -> studentResponseDtoList.add( StudentMapper.toDto(student)));
        return studentResponseDtoList;
    }

    @Override
    public String createStudent(StudentRequestDto studentRequestDto) {
        Student student = StudentMapper.toEntity(studentRequestDto);
        studentRepository.save(student);
        return "Student created successfully";
    }


    @Override
    public StudentResponseDto getDetailStudent(Integer id) {
        try {
            Student student = studentRepository.findById(id).get();
            return StudentMapper.toDto(student);
        } catch (NoSuchElementException exception) {
            return new StudentResponseDto(0, "null", "null");
        }
    }


    @Override
    public String updateStudent(Integer id, StudentRequestDto studentRequestDto) {
        Optional<Student> existingStudentOpt = studentRepository.findById(id);
        if(existingStudentOpt.isPresent()) {
            Student existingStudent = existingStudentOpt.get();
            Student newStudent = StudentMapper.toEntity(studentRequestDto);
            existingStudent.setName(newStudent.getName());
            existingStudent.setGender(newStudent.getGender());
            existingStudent.setPassword(newStudent.getPassword());
            studentRepository.save(existingStudent);
            return "Student is updated successfully!";
        }
        return "Not found student";
    }
}
