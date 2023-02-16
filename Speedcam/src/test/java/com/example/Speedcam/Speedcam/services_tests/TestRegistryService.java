package com.example.Speedcam.Speedcam.services_tests;

import com.example.Speedcam.Speedcam.entity.Registry;
import com.example.Speedcam.Speedcam.repository.RegistryRepository;
import com.example.Speedcam.Speedcam.service.impl.RegistryServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

@SpringBootTest
public class TestRegistryService {
    @InjectMocks
    private RegistryServiceImpl service;
    @Mock
    private RegistryRepository repo;

    @Test
    void testCreate() {

        Registry registry = new Registry();

        Assertions.assertDoesNotThrow(() ->
                service.create(registry));
    }

    @Test
    void testCreate_NullPointerException() {
        Registry registry = new Registry();

        when(repo.save(registry))
                .thenThrow(new NullPointerException());

        Assertions.assertThrows(NullPointerException.class, () ->
                service.create(registry));
    }

    @Test
    void testGetAllRegistry() {
        Assertions.assertDoesNotThrow(() ->
                service.getAllRegistry());
    }

    @Test
    void testFindById() {
        Registry registry = new Registry();

        Integer id = anyInt();
        when(repo.findById(id))
                .thenReturn(Optional.of(registry));

        Assertions.assertDoesNotThrow(() ->
                service.findRegistryById(2));
    }

    @Test
    void testFindById_NullPointerException() {
        Registry registry = new Registry();

        Integer id = anyInt();
        when(repo.findById(id))
                .thenThrow(new NullPointerException());

        Assertions.assertThrows(NullPointerException.class, () ->
                service.findRegistryById(id));
    }

    @Test
    void testDelete() {
        Registry registry = new Registry();
        Integer id = anyInt();

        when(repo.findById(id))
                .thenReturn(Optional.of(registry));

        Assertions.assertDoesNotThrow(() ->
                service.delete(id));
    }

    @Test
    void testDelete_NullPointerException() {
        Registry registry = new Registry();
        Integer id = anyInt();

        when(repo.findById(id))
                .thenThrow(new NullPointerException());

        Assertions.assertThrows(NullPointerException.class, () ->
                service.delete(id));

    }

}
