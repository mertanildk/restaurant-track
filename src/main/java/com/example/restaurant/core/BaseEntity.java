package com.example.restaurant.core;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

public abstract class BaseEntity {

    public BaseEntity() {
        this.createdAt = new Date();
    }

    @Id
    @GeneratedValue(strategy=jakarta.persistence.GenerationType.IDENTITY)
    private String id;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createdAt;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public Date getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

}
