package com.example.sentilo.repositories;

import com.example.sentilo.model.Component;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ComponentRepository extends MongoRepository<Component,String> {
    Component findByName(String name);
}
