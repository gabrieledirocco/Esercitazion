package com.example.Speedcam.Speedcam.repository;

import com.example.Speedcam.Speedcam.entity.Speedcam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpeedcamRepository extends JpaRepository<Speedcam, Integer> {
}
