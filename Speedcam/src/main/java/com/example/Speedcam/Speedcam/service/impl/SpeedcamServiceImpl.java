package com.example.Speedcam.Speedcam.service.impl;

import com.example.Speedcam.Speedcam.entity.Speedcam;
import com.example.Speedcam.Speedcam.entity.mapperDTO.MapperDTO;
import com.example.Speedcam.Speedcam.entity.mapperDTO.SpeedcamDTO;
import com.example.Speedcam.Speedcam.exception.NotFoundException;
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
    public Speedcam findSpeedcamById(Integer id) throws NotFoundException {
        Optional<Speedcam> s = speedcamRepository.findById(id);
        if(s.isEmpty()){
            throw new NotFoundException("Speedcam not found");
        }
        return s.get();
    }

    @Override
    public void updateSpeedcam(Integer id, Speedcam s) throws NotFoundException {
        Speedcam speedcam = findSpeedcamById(id);
        if(speedcam==null){
            throw new NotFoundException("Speedcam not found");
        }
        speedcam.setLocation(s.getLocation());

    }

    @Override
    public void deleteSpeedcam(Integer id) throws NotFoundException {
        Speedcam speedcam = findSpeedcamById(id);
        if(speedcam==null){
            throw new NotFoundException("Speedcam not found");
        }
        speedcamRepository.delete(speedcam);
    }


}
