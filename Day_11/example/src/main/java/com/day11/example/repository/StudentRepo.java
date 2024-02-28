package com.day11.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.day11.example.model.Student;

public interface StudentRepo extends JpaRepository<Student,Integer> {
    
}
