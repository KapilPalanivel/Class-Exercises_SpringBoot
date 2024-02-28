package com.day5.c1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.day5.c1.model.Children;

public interface ChildrenRepo extends JpaRepository<Children,Integer>{
    
}
