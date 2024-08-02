package com.chichastore.chichastore.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ChichaEntity
 */
@Entity
@Table(name = "drinks")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DrinkEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    Long id;

    String drink;
    @Column(length = 500)
    String Description;
    @Column(length = 500)
    String Image;

    Integer price;

    
}