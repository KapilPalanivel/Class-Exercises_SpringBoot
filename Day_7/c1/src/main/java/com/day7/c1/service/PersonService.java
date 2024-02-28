package com.day7.c1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.day7.c1.Repository.PersonRepository;
import com.day7.c1.model.Person;

@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;

    public List<Person> getAll()
    {
        try
        {
            return personRepository.findAll();
        }
        catch (Exception e) {
            return null;
        }
    }
    public Person AddPerson(Person person)
    {
        try
        {
            return personRepository.save(person);
        }
        catch (Exception e) {
            return null;
        }
    }
    public List<Person> getByAge(int age)
    {
        try
        {
            return personRepository.findByAge(age);
        }
        catch (Exception e) {
            return null;
        }
    }
}
