package com.example.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.model.Student;

import com.example.springboot.service.StudentService;

@RestController
public class StudentController {
    public StudentService studentService;
    public StudentController(StudentService studentService)
    {
        this.studentService=studentService;
    }
    @PostMapping("/post/student")
    public Student postMethod(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }
    @GetMapping("/getstudent/{id}")
    public Student getMethod(@PathVariable("id") int id) {
        return studentService.getStudent(id);
    }
    
}
