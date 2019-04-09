package com.example.sentilo.repositories;

import com.example.sentilo.model.Application;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ApplicationRepository extends MongoRepository<Application,String> {
     Application findByName(String name);
}
