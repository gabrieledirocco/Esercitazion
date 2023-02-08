package com.example.Speedcam.Speedcam.service;



import com.example.Speedcam.Speedcam.entity.Registry;
import com.example.Speedcam.Speedcam.entity.mapperDTO.RegistryDTO;
import com.example.Speedcam.Speedcam.exception.NotFoundException;

import java.util.List;

public interface RegistryService {

    Registry create (Registry registry);
    List<RegistryDTO> getAllRegistry();
    Registry findRegistryById(Integer id) throws NotFoundException;
    void update(Integer id, Registry fine) throws NotFoundException;
    void delete(Integer id) throws NotFoundException;
}
