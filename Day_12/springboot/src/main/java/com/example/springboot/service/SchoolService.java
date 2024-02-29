package com.example.springboot.service;

import org.springframework.stereotype.Service;

import com.example.springboot.model.School;
import com.example.springboot.repository.SchoolRepository;

@Service
public class SchoolService {
    public SchoolRepository schoolRepository;
    public SchoolService(SchoolRepository schoolRepository)
    {
        this.schoolRepository=schoolRepository;
    }
    public School saveSchool(School school)
    {
        return schoolRepository.save(school);
    }
    public School getSchool(int id)
    {
        return schoolRepository.findById(id).orElse(null);
    }
}
