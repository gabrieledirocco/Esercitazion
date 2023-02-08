package com.example.Speedcam.Speedcam.service;



import com.example.Speedcam.Speedcam.entity.Speedcam;
import com.example.Speedcam.Speedcam.entity.mapperDTO.SpeedcamDTO;

import java.util.List;

public interface SpeedcamService {

    Speedcam create (Speedcam speedcam);
    List<SpeedcamDTO> getAllSpeedcam();
    Speedcam findSpeedcamById(Integer id);
    void updateSpeedcam(Integer id, Speedcam fine);
    void deleteSpeedcam(Integer id);
}
