package com.example.restaurant.model;

import com.example.restaurant.core.BaseEntity;

import jakarta.persistence.Entity;

@Entity(name="tables")
public class TableEntity extends BaseEntity {
    
    private String tableNumber;



}
