package com.day11.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.day11.example.model.School;
import com.day11.example.repository.SchoolRepo;

@Service
public class SchoolService {
    @Autowired
    private SchoolRepo schoolRepo;
    @SuppressWarnings("null")
    public School addSchool(School school)
    {
        return schoolRepo.save(school);
    }

    public List<School> getSchool()
    {
        return schoolRepo.findAll();
    }
}
