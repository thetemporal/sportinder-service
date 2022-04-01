package com.adventurear.sportinderservice.controller;

import com.adventurear.sportinderservice.model.test.TestEntity;
import com.adventurear.sportinderservice.service.TestService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/test-entity")
@AllArgsConstructor
public class TestEntityController {
    private final TestService testService;

    @GetMapping()
    public List<TestEntity> listEntities() {
        return testService.getAllEntities();
    }

    @PostMapping()
    public TestEntity postTestEntity(@RequestBody TestEntity newTestEntity) {
        return testService.save(newTestEntity);
    }
}
