package com.firstapp.firstapp.controllers;
import com.firstapp.firstapp.dto.StudentRequestDto;
import com.firstapp.firstapp.dto.StudentResponseDto;
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
    List<StudentResponseDto> getStudents() {
        return studentServices.listStudent();
    }

    @PostMapping
    String createStudent(@RequestBody StudentRequestDto studentRequestDto) {
        return studentServices.createStudent(studentRequestDto);
    }

    @GetMapping("/{id}")
     StudentResponseDto detailStudent(@PathVariable Integer id) {
        return studentServices.getDetailStudent(id);
    }

    @PutMapping("/{id}")
    String updateStudent(@PathVariable Integer id, @RequestBody StudentRequestDto studentRequestDto) {
        return studentServices.updateStudent(id, studentRequestDto);
    }

    @DeleteMapping("/{student_id}")
    String deleteStudent(@PathVariable(name = "student_id") Integer id) {
        return studentServices.deleteStudent(id);
    }

}
