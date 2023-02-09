package com.example.Speedcam.Speedcam.service;



import com.example.Speedcam.Speedcam.entity.Speedcam;
import com.example.Speedcam.Speedcam.entity.mapperDTO.SpeedcamDTO;
import com.example.Speedcam.Speedcam.exception.NotFoundException;

import java.util.List;

public interface SpeedcamService {

    Speedcam create (Speedcam speedcam);
    List<SpeedcamDTO> getAllSpeedcam();
    Speedcam findSpeedcamById(Integer id) throws NotFoundException;
    void update(Integer id, Speedcam fine) throws NotFoundException;
}
