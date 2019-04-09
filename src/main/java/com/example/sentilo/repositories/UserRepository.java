package com.example.sentilo.repositories;

import com.example.sentilo.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UserRepository extends MongoRepository<User,String> {
     User findByName(String name);
}
