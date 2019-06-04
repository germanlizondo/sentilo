package com.example.sentilo.repositories;

import com.example.sentilo.model.Provider;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProviderRepository extends MongoRepository<Provider,String> {
    Provider findByName(String name);
}
