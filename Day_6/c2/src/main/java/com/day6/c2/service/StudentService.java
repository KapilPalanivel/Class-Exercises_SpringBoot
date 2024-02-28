package com.day6.c2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.day6.c2.model.Student;
import com.day6.c2.repository.StudentRepository;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    @SuppressWarnings("null")
    public boolean addStudent(Student student) {
        try {
            studentRepository.save(student);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public Page<Student> getStudent(int pageNumber, int pageSize)
    {
        Pageable page=PageRequest.of(pageNumber, pageSize);
        return studentRepository.findAll(page);
    }

    public Page<Student> getStudentpages(int pageNumber,int pageSize,String field)
    {
        Pageable page=PageRequest.of(pageNumber, pageSize,Sort.by(Sort.Direction.ASC, field));
        return studentRepository.findAll(page);
    }
}
