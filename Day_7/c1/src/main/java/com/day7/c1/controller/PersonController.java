package com.day7.c1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.day7.c1.model.Person;
import com.day7.c1.service.PersonService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/api/person")
public class PersonController {
    @Autowired
    private PersonService personService;

    @PostMapping
    public ResponseEntity<Person> postMethodName(@RequestBody Person entity) {
        
        Person p=personService.AddPerson(entity);

        if(p==null)
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        else
            return new ResponseEntity<>(p,HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Person>> getAll() {
        
        List<Person> p=personService.getAll();

        if(p==null)
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        else
            return new ResponseEntity<>(p,HttpStatus.OK);
    }
    
    @GetMapping("/byAge")
    public ResponseEntity<List<Person>> getByAge(@RequestParam int age) {
        List<Person> lst=personService.getByAge(age);
        if(lst==null)
        {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        else 
            return new ResponseEntity<>(lst,HttpStatus.OK);
    }
    
}
