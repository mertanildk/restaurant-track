package com.example.restaurant.model;

import com.example.restaurant.core.BaseEntity;

import jakarta.persistence.Entity;

@Entity(name="orders")
public class OrderEntity extends BaseEntity {
    
    private String orderNumber;

}