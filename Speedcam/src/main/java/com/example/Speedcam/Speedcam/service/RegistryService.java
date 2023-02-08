package com.example.Speedcam.Speedcam.service;



import com.example.Speedcam.Speedcam.entity.Registry;
import com.example.Speedcam.Speedcam.entity.mapperDTO.RegistryDTO;

import java.util.List;

public interface RegistryService {

    Registry create (Registry registry);
    List<RegistryDTO> getAllRegistry();
    Registry findRegistryById(Integer id);
    void updateRegistry(Integer id, Registry fine);
    void deleteRegistry(Integer id);
}
