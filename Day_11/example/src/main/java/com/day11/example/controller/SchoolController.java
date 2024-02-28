package com.day11.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.day11.example.model.School;
import com.day11.example.service.SchoolService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class SchoolController {
    @Autowired
    private SchoolService schoolService;

    @PostMapping("/addSchool")
    public School postMethodName(@RequestBody School entity) {
        
        return schoolService.addSchool(entity);
    }
    
    @GetMapping("/getSchool")
    public List<School> getMethodName() {
        
        return schoolService.getSchool();
    }
}
