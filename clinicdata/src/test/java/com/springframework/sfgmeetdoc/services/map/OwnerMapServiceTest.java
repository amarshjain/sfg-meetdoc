package com.springframework.sfgmeetdoc.services.map;

import com.springframework.sfgmeetdoc.model.Owner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class OwnerMapServiceTest {

    OwnerMapService ownerMapService;

    final Long ownerId = 1L;
    final String lastName = "rajan";

    @BeforeEach
    void setUp() {
        ownerMapService = new OwnerMapService(new PatientTypeMapService(), new PatientMapService());

//        ownerMapService.save(Owner.builder().id(ownerId).lastName(lastName).build());
    }

    @Test
    void findAll() {
        Set<Owner> ownerSet = ownerMapService.findAll();

        assertEquals(1, ownerSet.size());
    }

    @Test
    void findById() {
        Owner owner = ownerMapService.findById(ownerId);

        assertEquals(1, owner.getId());
    }

    @Test
    void saveExisintId() {
        long id = 2L;

//        Owner owner2 = Owner.builder().id(id).build();

//        Owner savedOwner = ownerMapService.save(owner2);

//        assertEquals(id, savedOwner.getId());
    }

    @Test
    void saveNoId() {
        Owner savedOwner = ownerMapService.save(Owner.builder().build());

        assertNotNull(savedOwner);
        assertNotNull(savedOwner.getId());
    }

    @Test
    void delete() {
        ownerMapService.delete(ownerMapService.findById(ownerId));

        assertEquals(0, ownerMapService.findAll().size());
    }

    @Test
    void deleteByID() {
        ownerMapService.deleteByID(ownerId);

        assertEquals(0, ownerMapService.findAll().size());
    }

    @Test
    void findByLastName() {
        Owner rajan = ownerMapService.findByLastName(lastName);

        assertNotNull(rajan);

        assertEquals(ownerId, rajan.getId());
    }

    @Test
    void findByLastNameNotFound() {
        Owner rajan = ownerMapService.findByLastName("foo");

        assertNull(rajan);

    }
}