package com.example.sentilo.repositories;

import com.example.sentilo.model.Sensor;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SensorRepository extends MongoRepository<Sensor,String> {
    Sensor findByName(String name);
}
