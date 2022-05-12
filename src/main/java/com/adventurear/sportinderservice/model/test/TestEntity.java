package com.adventurear.sportinderservice.model.test;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document
public class TestEntity {
    @Id
    private String id;
    private String testString;
    private int testInteger;
    private boolean testBoolean;
    @DBRef
    private List<TestNestedEntity> testNestedEntities;

}
