package com.example.Speedcam.Speedcam.service.impl;

import com.example.Speedcam.Speedcam.entity.Fine;
import com.example.Speedcam.Speedcam.entity.Registry;
import com.example.Speedcam.Speedcam.entity.mapperDTO.FineDTO;
import com.example.Speedcam.Speedcam.entity.mapperDTO.MapperDTO;
import com.example.Speedcam.Speedcam.entity.mapperDTO.RegistryDTO;
import com.example.Speedcam.Speedcam.repository.RegistryRepository;
import com.example.Speedcam.Speedcam.service.RegistryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class RegistryServiceImpl implements RegistryService {

    @Autowired
    private RegistryRepository registryRepository;
    @Autowired
    private MapperDTO mapperDTO;
    @Override
    public Registry create(Registry registry) {
        registryRepository.save(registry);
        return registry;
    }

    @Override
    public List<RegistryDTO> getAllRegistry() {

        return this.mapperDTO.toDtoRegistryList(registryRepository.findAll());
    }

    @Override
    public Registry findRegistryById(Integer id) {
        Optional<Registry> r = registryRepository.findById(id);
        if(r.isEmpty()){
        }
        return r.get();
    }

    @Override
    public void updateRegistry(Integer id, Registry r) {
        Registry registry = findRegistryById(id);
        if(registry==null){

        }
        registry.setName(r.getName());
        registry.setSurname(r.getSurname());
        registry.setDetail(r.getDetail());
        registryRepository.save(registry);
    }

    @Override
    public void deleteRegistry(Integer id) {
        Registry r = findRegistryById(id);
        registryRepository.delete(r);
    }
}
