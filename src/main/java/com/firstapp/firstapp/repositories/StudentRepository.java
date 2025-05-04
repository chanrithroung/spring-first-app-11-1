package com.firstapp.firstapp.repositories;

import com.firstapp.firstapp.entity.student.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer>{}