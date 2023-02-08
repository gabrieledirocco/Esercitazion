package com.example.Speedcam.Speedcam.controller;

import com.example.Speedcam.Speedcam.entity.Registry;
import com.example.Speedcam.Speedcam.entity.Speedcam;
import com.example.Speedcam.Speedcam.entity.mapperDTO.RegistryDTO;
import com.example.Speedcam.Speedcam.entity.mapperDTO.SpeedcamDTO;
import com.example.Speedcam.Speedcam.exception.NotFoundException;
import com.example.Speedcam.Speedcam.service.SpeedcamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/speedcam")
public class SpeedcamController {
    @Autowired
    private SpeedcamService speedcamService;
    @GetMapping
    public ResponseEntity<List<SpeedcamDTO>> getAllSpeedcamDTO(){
        List<SpeedcamDTO> speedcamDTOList = speedcamService.getAllSpeedcam();
        return ResponseEntity.ok(speedcamDTOList);
    }

    @GetMapping("/{id}")
    public Speedcam getSpeedcamById (@PathVariable("id") Integer id) throws NotFoundException {
        return speedcamService.findSpeedcamById(id);
    }
    @PostMapping
    public void createSpeedcam(@RequestBody Speedcam speedcam){
        speedcamService.create(speedcam);
    }

    @PutMapping("/{id}")
    public void updateSpeedcam(@PathVariable("id") Integer id, @RequestBody Speedcam speedcam) throws NotFoundException {
        speedcamService.update(id, speedcam);
    }
    @DeleteMapping("/{id}")
    public void deleteRegistry(@PathVariable("id") Integer id) throws NotFoundException {
        speedcamService.delete(id);
    }
}
