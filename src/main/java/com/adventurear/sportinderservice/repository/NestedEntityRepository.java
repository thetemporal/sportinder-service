package com.adventurear.sportinderservice.repository;

import com.adventurear.sportinderservice.model.test.TestNestedEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface NestedEntityRepository extends MongoRepository<TestNestedEntity, String> {
}
