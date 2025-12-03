package com.example.restaurant.controller.beanScope;

import java.util.UUID;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "singleton", proxyMode=ScopedProxyMode.TARGET_CLASS)
//prototype, request, session, application, websocket
public class Food {
    private String id;

    public Food() {
        this.id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
}
