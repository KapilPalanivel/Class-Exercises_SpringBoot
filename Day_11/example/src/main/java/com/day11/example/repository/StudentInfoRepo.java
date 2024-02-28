package com.day11.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.day11.example.model.StudentInfo;

public interface StudentInfoRepo extends JpaRepository<StudentInfo,Integer> {
    
}
