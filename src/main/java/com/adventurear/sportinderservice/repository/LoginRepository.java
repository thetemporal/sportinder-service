package com.adventurear.sportinderservice.repository;

import com.adventurear.sportinderservice.model.user.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface LoginRepository extends MongoRepository<User, String> {
    public Optional<User> findByUsernameAndPassword(String username, String password);
}