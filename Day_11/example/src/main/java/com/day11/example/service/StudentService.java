package com.day11.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.day11.example.model.Student;
import com.day11.example.repository.StudentRepo;

@Service
public class StudentService
{
    @Autowired
    private StudentRepo studentRepo;

    public List<Student> getStudents()
    {
        return studentRepo.findAll();
    }

   
    @SuppressWarnings("null")
    public Student addStudent(Student entity) {        
        return studentRepo.save(entity);
    }
}