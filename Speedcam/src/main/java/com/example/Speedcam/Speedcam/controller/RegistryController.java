package com.example.Speedcam.Speedcam.controller;

import com.example.Speedcam.Speedcam.entity.Fine;
import com.example.Speedcam.Speedcam.entity.Registry;
import com.example.Speedcam.Speedcam.entity.mapperDTO.FineDTO;
import com.example.Speedcam.Speedcam.entity.mapperDTO.RegistryDTO;
import com.example.Speedcam.Speedcam.exception.NotFoundException;
import com.example.Speedcam.Speedcam.service.RegistryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/registry")
public class  RegistryController {
    @Autowired
    private RegistryService registryService;
    @GetMapping
    public ResponseEntity<List<RegistryDTO>> getAllRegistryDTO(){
        List<RegistryDTO> registryDTOList = registryService.getAllRegistry();
        return ResponseEntity.ok(registryDTOList);
    }

    @GetMapping("/{id}")
    public Registry getRegistryById (@PathVariable("id") Integer id) throws NotFoundException {
        return registryService.findRegistryById(id);
    }
    @PostMapping
    public void createRegistry(@RequestBody Registry registry){
        registryService.create(registry);
    }

    @PutMapping("/{id}")
    public void updateRegistry(@PathVariable("id") Integer id, @RequestBody Registry registry) throws NotFoundException {
        registryService.update(id, registry);
    }
    @DeleteMapping("/{id}")
    public void deleteRegistry(@PathVariable("id") Integer id) throws NotFoundException {
        registryService.delete(id);
    }
}
