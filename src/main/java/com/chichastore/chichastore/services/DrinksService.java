package com.chichastore.chichastore.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chichastore.chichastore.entities.DrinkEntity;
import com.chichastore.chichastore.repository.DrinksRepository;

@Service
public class DrinksService {

    @Autowired
    DrinksRepository drinksRepository;
    public List<DrinkEntity> getDrinks(){


        return drinksRepository.findAll();

    }
    
}
