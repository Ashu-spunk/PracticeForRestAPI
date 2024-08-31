package com.spring.practice.restapi.controllers;

import com.spring.practice.restapi.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/api")
public class ApiController {

    @GetMapping("/hello")
    public Response helloWorld() {
        return new Response("Hello, Spring Boot practice for REST API!");
    }
}
