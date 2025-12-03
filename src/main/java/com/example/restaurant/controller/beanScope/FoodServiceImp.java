package com.example.restaurant.controller.beanScope;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class FoodServiceImp {

    private final ObjectProvider<Food> fObjectProvider;

    public FoodServiceImp(ObjectProvider<Food> fObjectProvider) {
        this.fObjectProvider = fObjectProvider;
    }

    @GetMapping("/yemek")
    public String getFoodUniqueId() {
    Food food = fObjectProvider.getObject();  // getObject() ile doğrudan nesneyi alır
    return food.getId();
}

}
