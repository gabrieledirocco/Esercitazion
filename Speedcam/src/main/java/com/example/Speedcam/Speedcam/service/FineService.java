package com.example.Speedcam.Speedcam.service;

import com.example.Speedcam.Speedcam.entity.Fine;
import com.example.Speedcam.Speedcam.entity.mapperDTO.FineDTO;

import java.util.List;

public interface FineService {
    Fine create (Fine fine);
    List<FineDTO> getAllFine();
    Fine findFineById(Integer id);
    void updateFine(Integer id, Fine fine);
    void deleteFine(Integer id);

}
