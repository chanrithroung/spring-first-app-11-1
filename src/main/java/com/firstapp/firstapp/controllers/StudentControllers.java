package com.firstapp.firstapp.controllers;
import com.firstapp.firstapp.apiResponse.ApiResponse;
import com.firstapp.firstapp.dto.StudentRequestDto;
import com.firstapp.firstapp.dto.StudentResponseDto;
import com.firstapp.firstapp.services.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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

//    @GetMapping("/test")
//    ResponseEntity<ApiResponse<String>> test() {
//        return ResponseEntity.ok(new ApiResponse<>( "success fetch student", 200, "Student data" ));
//    }

    @GetMapping
    ResponseEntity<ApiResponse<List<StudentResponseDto>>> getStudents() {
        return ResponseEntity.ok( new ApiResponse<>(
                "success",
                200,
                studentServices.listStudent()
        ) );
    }

    @PostMapping
    ResponseEntity<ApiResponse<String>> createStudent(@RequestBody StudentRequestDto studentRequestDto) {
        return ResponseEntity.ok( new ApiResponse(
                studentServices.createStudent(studentRequestDto),
                200,
                "Student created Successfully!"
        ) );
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
