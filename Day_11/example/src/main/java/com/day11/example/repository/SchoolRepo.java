package com.day11.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.day11.example.model.School;

public interface SchoolRepo extends JpaRepository<School,Integer> {

    
}