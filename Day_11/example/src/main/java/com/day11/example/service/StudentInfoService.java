package com.day11.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.day11.example.model.StudentInfo;
import com.day11.example.repository.StudentInfoRepo;
@Service
public class StudentInfoService {
    @Autowired
    private StudentInfoRepo studentInfoRepo;

    public List<StudentInfo> gStudentInfo()
    {
        return studentInfoRepo.findAll();
    }

    @SuppressWarnings("null")
    public StudentInfo addStudentInfo(StudentInfo studentInfo)
    {
        return studentInfoRepo.save(studentInfo);
    }
}
