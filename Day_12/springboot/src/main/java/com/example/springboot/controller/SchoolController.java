package com.example.springboot.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.model.School;
import com.example.springboot.service.SchoolService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
public class SchoolController {
    public SchoolService schoolService;
    public SchoolController(SchoolService schoolService)
    {
        this.schoolService = schoolService;
    }
    @PostMapping("/post/school")
    public School postMethodName(@RequestBody School school) {
        return schoolService.saveSchool(school);
    }
    @GetMapping("/getschool/{id}")
    public School getMethodName(@PathVariable("id") int id) {
        return schoolService.getSchool(id);
    }
    
    
}
