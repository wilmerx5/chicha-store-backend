package com.chichastore.chichastore.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chichastore.chichastore.entities.DrinkEntity;
import com.chichastore.chichastore.services.DrinksService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins={"http://localhost:5173"})
public class DrinkController {

    @Autowired
    DrinksService drinksService;

    @GetMapping("/drinks")
    public ResponseEntity<List<DrinkEntity>> getDrinks() {
        try{

            return ResponseEntity.ok(drinksService.getDrinks());
        }
        catch(Exception e){
             return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
    }

}
