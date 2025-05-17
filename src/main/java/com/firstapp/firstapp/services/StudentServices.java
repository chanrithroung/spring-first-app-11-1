package com.firstapp.firstapp.services;
import com.firstapp.firstapp.dto.StudentRequestDto;
import com.firstapp.firstapp.dto.StudentResponseDto;
import com.firstapp.firstapp.entity.student.Student;
import java.util.List;

public interface StudentServices {
    List<StudentResponseDto> listStudent();
    String createStudent(StudentRequestDto studentRequestDto);
    StudentResponseDto getDetailStudent(Integer id);
    String updateStudent(Integer id, StudentRequestDto studentRequestDto);
    String deleteStudent(Integer id);
}
