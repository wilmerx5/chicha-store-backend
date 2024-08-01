package com.chichastore.chichastore.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class DrinkController {
    @GetMapping("/drinks")
    public String getDrinks() {
        return "drinks";
    }
    
    
}
