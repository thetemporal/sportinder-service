package com.adventurear.sportinderservice.repository;

import com.adventurear.sportinderservice.model.test.TestEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TestRepository extends MongoRepository<TestEntity, String> {
}
