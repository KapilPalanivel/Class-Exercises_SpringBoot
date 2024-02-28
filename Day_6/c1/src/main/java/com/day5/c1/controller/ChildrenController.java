package com.day5.c1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.day5.c1.model.Children;
import com.day5.c1.service.ChildrenService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/api/children")
@RestController
public class ChildrenController {
    @Autowired
    private ChildrenService childrenService;


    @PostMapping
    public ResponseEntity<List<Children>> postMethodName(@RequestBody List<Children> entity) {
        if (childrenService.addChild(entity)) {
            return new ResponseEntity<>(entity, HttpStatus.CREATED);
        }

        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
    /*@PostMapping
    public ResponseEntity<Children> postMethodName(@RequestBody Children entity) {
        if (childrenService.addChild(entity)) {
            return new ResponseEntity<>(entity, HttpStatus.CREATED);
        }
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }*/

    @GetMapping("/sortBy/{field}")
    public ResponseEntity<List<Children>> getMethodName(@PathVariable("field") String field) {
        List<Children> lis = childrenService.getChildrens(field);
        if (!lis.isEmpty()) {
            return new ResponseEntity<>(lis, HttpStatus.OK);
        } else
        {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/{offset}/{pagesize}")

    public ResponseEntity<Page<Children>> getMethodName(@PathVariable("offset") int offset,
            @PathVariable("pagesize") int pagesize) {
        Page<Children> lis = childrenService.getChild(offset, pagesize);
        if (!lis.isEmpty()) {
            return new ResponseEntity<>(lis, HttpStatus.OK);
        } else
        System.out.print(lis.toString());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @GetMapping("/{offset}/{pagesize}/{field}")

    public ResponseEntity<Page<Children>> getMethodName(@PathVariable("offset") int offset,
    @PathVariable("pagesize") int pagesize, @PathVariable("field") String field) {
        Page<Children> lis = childrenService.getChildSorted(offset, pagesize,field);
        if (!lis.isEmpty()) {
            return new ResponseEntity<>(lis, HttpStatus.OK);
        } 
        else
        System.out.print(lis.toString());
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
