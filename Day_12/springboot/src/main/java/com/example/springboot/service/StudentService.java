package com.example.springboot.service;

import org.springframework.stereotype.Service;

import com.example.springboot.model.Student;
import com.example.springboot.repository.StudentRepository;

@Service
public class StudentService {
    public StudentRepository studentRepository;
    public StudentService(StudentRepository studentRepository)
    {
        this.studentRepository=studentRepository;
    }
    public Student saveStudent(Student student)
    {
        return studentRepository.save(student);
    }
    public Student getStudent(int id)
    {
        return studentRepository.findById(id).orElse(null);
    }
}
