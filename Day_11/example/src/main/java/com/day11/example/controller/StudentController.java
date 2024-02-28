package com.day11.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.day11.example.model.Student;
import com.day11.example.service.StudentService;



@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;
    
    @GetMapping("/getStudent")
    public List<Student> getStudent() {        
        return studentService.getStudents();
    }
    @PostMapping("/addStudent")
    public Student addStudent(@RequestBody Student param) {
        return studentService.addStudent(param);
    }
}
