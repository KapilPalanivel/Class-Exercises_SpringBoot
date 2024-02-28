package com.day6.c2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.day6.c2.model.Student;
import com.day6.c2.service.StudentService;

@RestController
@RequestMapping("/api/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping 
    public Student addStudent(@RequestBody Student student) {
        if (studentService.addStudent(student)) {
            return student;
        } else
            return student;
    }

    @GetMapping
    public ResponseEntity<List<Student>> getStudent(@RequestParam int pageNumber,@RequestParam int pageSize) {
        Page<Student> lis = studentService.getStudent(pageNumber, pageSize);
        if (lis != null)
            return new ResponseEntity<>(lis.getContent(), HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @GetMapping("/sort")
    public ResponseEntity<List<Student>> getStudentSorted(@RequestParam int pageNumber, @RequestParam int pageSize,
            @RequestParam String field) {
        Page<Student> lis = studentService.getStudentpages(pageNumber, pageSize, field);
        if (lis != null)
            return new ResponseEntity<>(lis.getContent(), HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
