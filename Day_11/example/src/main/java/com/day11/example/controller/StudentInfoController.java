package com.day11.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.day11.example.model.StudentInfo;
import com.day11.example.service.StudentInfoService;

@RestController
public class StudentInfoController {
    @Autowired
    private StudentInfoService studentInfoService;

    @GetMapping("/getStudentInfo")
    public List<StudentInfo> getStudentInfo() {
        return studentInfoService.gStudentInfo();
    }

    @PostMapping("/addStudentInfo")
    public StudentInfo addStudentInfo(@RequestBody StudentInfo studentInfo) {
        return studentInfoService.addStudentInfo(studentInfo);
    }
}
