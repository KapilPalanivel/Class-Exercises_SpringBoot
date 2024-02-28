package com.day7.c1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.day7.c1.model.Person;
import java.util.List;


public interface PersonRepository extends JpaRepository<Person,Integer> {
    List<Person> findByAge(int age);
}
