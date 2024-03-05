package com.swagger.swaggerui.controller;

import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class ApiController {
    @GetMapping("/Api")
    @ApiOperation(value = "Greet User")
    public String getMethodName(@RequestParam String param) {
        return "Hello String";
    }
}
