package com.kodilla.ecommercee;

import com.kodilla.ecommercee.domain.GenericEntity;
import com.kodilla.ecommercee.repository.GenericEntityRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest()
class SpringBootJPAIntegrationTest {

    @Autowired
    private GenericEntityRepository genericEntityRepository;

    @Test
    void givenGenericEntityRepository_whenSaveAndRetreiveEntity_thenOK() {
        GenericEntity genericEntity = genericEntityRepository
                .save(new GenericEntity("test"));
        Optional<GenericEntity> foundEntity = genericEntityRepository
                .findById(genericEntity.getId());

        assertTrue(foundEntity.isPresent());
        assertEquals(genericEntity.getVal(), foundEntity.get().getVal());
    }
}
