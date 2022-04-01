package com.adventurear.sportinderservice.service;

import com.adventurear.sportinderservice.model.test.TestEntity;
import com.adventurear.sportinderservice.repository.NestedEntityRepository;
import com.adventurear.sportinderservice.repository.TestRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TestService {
    private final TestRepository testRepository;
    private final NestedEntityRepository nestedEntityRepository;

    public TestEntity save(TestEntity newTestEntity) {
        nestedEntityRepository.saveAll(newTestEntity.getTestNestedEntities());
        return testRepository.insert(newTestEntity);
    }

    public List<TestEntity> getAllEntities() {
        return testRepository.findAll();
    }
}
