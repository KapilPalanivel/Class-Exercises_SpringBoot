package com.day6.c2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.day6.c2.model.Student;

public interface StudentRepository extends JpaRepository<Student,Integer> {
    
}
