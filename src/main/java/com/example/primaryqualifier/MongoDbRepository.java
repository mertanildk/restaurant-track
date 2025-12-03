package com.example.primaryqualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("mongoDbRepository")
public class MongoDbRepository implements DatabaseConnection {

    @Override
    public void connect() {
        System.out.println("Connected to Mongo database.");
    }
}