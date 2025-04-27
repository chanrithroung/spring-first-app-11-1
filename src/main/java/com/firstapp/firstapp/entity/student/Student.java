package com.firstapp.firstapp.entity.student;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Student {
    private int id;
    private String name;
    private String gender;
}
