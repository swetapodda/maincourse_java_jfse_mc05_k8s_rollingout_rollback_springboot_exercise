package com.stackroute.sbservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/message")
public class MessageController {
    //@value to get value from application.yml file
    @Value("${app.message}")
    private String message;

    @GetMapping
    public String message(){
        return message;
    }
}