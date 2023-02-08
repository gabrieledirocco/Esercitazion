package com.example.Speedcam.Speedcam.service;

import com.example.Speedcam.Speedcam.entity.Fine;
import com.example.Speedcam.Speedcam.entity.mapperDTO.FineDTO;
import com.example.Speedcam.Speedcam.exception.NotFoundException;

import java.util.List;

public interface FineService {
    Fine create (Fine fine);
    List<FineDTO> getAllFine();
    Fine findFineById(Integer id) throws NotFoundException;
    void update(Integer id, Fine fine) throws NotFoundException;
    void delete(Integer id) throws NotFoundException;

}
