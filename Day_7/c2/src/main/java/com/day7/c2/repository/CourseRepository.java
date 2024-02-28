package com.day7.c2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.day7.c2.model.Course;

public interface CourseRepository extends JpaRepository<Course,Integer> {
    
}
