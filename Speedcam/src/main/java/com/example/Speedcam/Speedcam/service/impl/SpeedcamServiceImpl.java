package com.example.Speedcam.Speedcam.service.impl;

import com.example.Speedcam.Speedcam.entity.Registry;
import com.example.Speedcam.Speedcam.entity.Speedcam;
import com.example.Speedcam.Speedcam.entity.mapperDTO.MapperDTO;
import com.example.Speedcam.Speedcam.entity.mapperDTO.SpeedcamDTO;
import com.example.Speedcam.Speedcam.repository.RegistryRepository;
import com.example.Speedcam.Speedcam.repository.SpeedcamRepository;
import com.example.Speedcam.Speedcam.service.SpeedcamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SpeedcamServiceImpl implements SpeedcamService{

    @Autowired
    private SpeedcamRepository speedcamRepository;
    @Autowired
    private MapperDTO mapperDTO;
    @Override
    public Speedcam create(Speedcam speedcam) {
        speedcamRepository.save(speedcam);
        return speedcam;
    }

    @Override
    public List<SpeedcamDTO> getAllSpeedcam() {
        return this.mapperDTO.toDtoSpeedcamList(speedcamRepository.findAll());

    }

    @Override
    public Speedcam findSpeedcamById(Integer id) {
        Optional<Speedcam> s = speedcamRepository.findById(id);
        if(s.isEmpty()){
        }
        return s.get();
    }

    @Override
    public void updateSpeedcam(Integer id, Speedcam s) {
        Speedcam speedcam = findSpeedcamById(id);
        if(speedcam==null){

        }
        speedcam.setLocation(s.getLocation());

    }

    @Override
    public void deleteSpeedcam(Integer id) {
        Speedcam s = findSpeedcamById(id);
        speedcamRepository.delete(s);
    }


}
