package com.firstapp.firstapp.entity.student;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "tb_student")
public class Student {
    @Column(name = "student_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Id
    private int id;
    @Column(name = "student_name")
    private String name;
    @Column
    private String gender;
}
