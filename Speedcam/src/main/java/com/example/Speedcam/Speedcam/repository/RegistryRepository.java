package com.example.Speedcam.Speedcam.repository;

import com.example.Speedcam.Speedcam.entity.Registry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistryRepository extends JpaRepository<Registry, Integer> {
}
