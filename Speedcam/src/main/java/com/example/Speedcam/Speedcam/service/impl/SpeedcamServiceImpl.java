package com.example.Speedcam.Speedcam.service.impl;

import com.example.Speedcam.Speedcam.entity.Speedcam;
import com.example.Speedcam.Speedcam.entity.mapperDTO.MapperDTO;
import com.example.Speedcam.Speedcam.entity.mapperDTO.SpeedcamDTO;
import com.example.Speedcam.Speedcam.exception.NotFoundException;
import com.example.Speedcam.Speedcam.repository.SpeedcamRepository;
import com.example.Speedcam.Speedcam.service.SpeedcamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class SpeedcamServiceImpl implements SpeedcamService {

    @Autowired
    private SpeedcamRepository speedcamRepository;
    @Autowired
    private MapperDTO mapperDTO;

    @Override
    public Speedcam create(Speedcam speedcam) {
        return speedcamRepository.save(speedcam);

    }

    @Override
    public List<SpeedcamDTO> getAllSpeedcam() {

        List<Speedcam> speedcamList = speedcamRepository.findAll();

        if (speedcamList == null) {
            return null;
        }
        List<SpeedcamDTO> speedcamDTOList = new ArrayList<>();
        for (Speedcam speedcam : speedcamList) {
            speedcamDTOList.add(mapperDTO.speedcamToSpeedcamDTO(speedcam));
        }
        return speedcamDTOList;
    }

    @Override
    public Speedcam findSpeedcamById(Integer id) throws NotFoundException {
        Optional<Speedcam> s = speedcamRepository.findById(id);
        if (s.isEmpty()) {
            throw new NotFoundException("Speedcam not found");
        }
        return s.get();
    }

    @Override
    public void update(Integer id, Speedcam s) throws NotFoundException {
        Speedcam speedcam = findSpeedcamById(id);
        if (speedcam == null) {
            throw new NotFoundException("Speedcam not found");
        }
        speedcam.setLocation(s.getLocation());

    }


}
