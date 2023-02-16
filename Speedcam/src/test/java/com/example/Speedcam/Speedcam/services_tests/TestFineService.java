package com.example.Speedcam.Speedcam.services_tests;

import com.example.Speedcam.Speedcam.entity.Fine;
import com.example.Speedcam.Speedcam.entity.mapperDTO.MapperDTO;
import com.example.Speedcam.Speedcam.repository.FineRepository;
import com.example.Speedcam.Speedcam.service.impl.FineServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;


import java.util.Optional;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

@SpringBootTest
public class TestFineService {

    @InjectMocks
    private FineServiceImpl service;
    @Mock
    private FineRepository repo;
    @Mock
    private MapperDTO mapper;

    @Test
    void testCreateFineMethod() {

        Fine fine = new Fine();
        Assertions.assertDoesNotThrow(() -> {
            service.create(fine);
        });
    }

    @Test
    void testCreateFineMethod_NullPointerException() {

        Fine fine = new Fine();
        when(repo.save(fine))
                .thenThrow(new NullPointerException());

        Assertions.assertThrows(NullPointerException.class, () ->
                service.create(fine));
    }

    @Test
    void testGetAllFine(){
        Assertions.assertDoesNotThrow(()->
                service.getAllFine());
    }

    @Test
    void testFindById() {
        Fine fine = new Fine();

        Integer id = anyInt();
        when(repo.findById(id))
                .thenReturn(Optional.of(fine));

        Assertions.assertDoesNotThrow(() -> {
            service.findFineById(id);
        });
    }

    @Test
    void testFindById_NullPointerException() {
        Fine fine = new Fine();
        Integer id = anyInt();
        when(repo.findById(id))
                .thenThrow(new NullPointerException());

        Assertions.assertThrows(NullPointerException.class, () ->
                service.findFineById(id));
    }

    @Test
    void testUpdate() {
        Fine fine = new Fine();
        Integer id = anyInt();

        when(repo.findById(id))
                .thenReturn(Optional.of(fine));

        Assertions.assertDoesNotThrow(() -> {
            service.update(id, fine);
        });
    }

    @Test
    void testUpdate_NullPointerException() {
        Fine fine = new Fine();
        Integer id = anyInt();

        when(repo.findById(id))
                .thenThrow(new NullPointerException());

        Assertions.assertThrows(NullPointerException.class, () ->
                service.update(id, fine));
    }
}


