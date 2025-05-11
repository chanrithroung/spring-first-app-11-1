package com.firstapp.firstapp.mapper;

import com.firstapp.firstapp.dto.StudentRequestDto;
import com.firstapp.firstapp.dto.StudentResponseDto;
import com.firstapp.firstapp.entity.student.Student;
import org.springframework.jdbc.datasource.init.ScriptUtils;

public class StudentMapper {
    static public Student toEntity(StudentRequestDto studentRequestDto) {
        Student student = new Student();
        student.setName(studentRequestDto.getName());
        student.setGender(studentRequestDto.getGender());
        student.setPassword(studentRequestDto.getPassword());
        return student;

//        return new Student(
//                studentRequestDto.getName(),
//                studentRequestDto.getGender(),
//                studentRequestDto.getPassword()
//        );
    }

    static public StudentResponseDto toDto(Student student) {
        StudentResponseDto studentResponseDto = new StudentResponseDto();
        studentResponseDto.setId(student.getId());
        studentResponseDto.setName(student.getName());
        studentResponseDto.setGender(student.getGender());
        return studentResponseDto;
    }


}
