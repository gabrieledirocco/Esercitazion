package com.example.Speedcam.Speedcam.controller;

import com.example.Speedcam.Speedcam.entity.Fine;
import com.example.Speedcam.Speedcam.entity.mapperDTO.FineDTO;
import com.example.Speedcam.Speedcam.exception.NotFoundException;
import com.example.Speedcam.Speedcam.service.FineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fine")
public class FineController {
    @Autowired
    private FineService fineService;
    @GetMapping
    public ResponseEntity<List<FineDTO>> getAllFineDTO(){
        List<FineDTO> fineDTOList = fineService.getAllFine();
        return ResponseEntity.ok(fineDTOList);
    }

    @GetMapping("/{id}")
    public Fine getFineById (@PathVariable ("id") Integer id) throws NotFoundException {
        return fineService.findFineById(id);
    }
    @PostMapping
    public void createFine(@RequestBody Fine fine){
         fineService.create(fine);
    }

    @PutMapping("/{id}")
    public void updateFine(@PathVariable("id") Integer id, @RequestBody Fine fine) throws NotFoundException {
        fineService.update(id, fine);
    }
    @DeleteMapping("/{id}")
    public void deleteFine(@PathVariable("id") Integer id) throws NotFoundException {
        fineService.delete(id);
    }

}
