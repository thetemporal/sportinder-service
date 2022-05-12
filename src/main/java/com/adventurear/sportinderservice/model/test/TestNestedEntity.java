package com.adventurear.sportinderservice.model.test;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@Document
public class TestNestedEntity {

    @Id
    private String id;
    private String testProperty;
}
