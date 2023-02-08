package com.example.Speedcam.Speedcam.repository;

import com.example.Speedcam.Speedcam.entity.Fine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FineRepository extends JpaRepository<Fine, Integer> {

}
