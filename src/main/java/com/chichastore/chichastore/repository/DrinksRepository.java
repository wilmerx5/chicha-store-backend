package com.chichastore.chichastore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chichastore.chichastore.entities.DrinkEntity;

@Repository
public interface DrinksRepository   extends JpaRepository<DrinkEntity,Long> {
    
}
