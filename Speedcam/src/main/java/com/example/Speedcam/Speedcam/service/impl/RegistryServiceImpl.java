package com.example.Speedcam.Speedcam.service.impl;

import com.example.Speedcam.Speedcam.entity.Registry;
import com.example.Speedcam.Speedcam.entity.mapperDTO.MapperDTO;
import com.example.Speedcam.Speedcam.entity.mapperDTO.RegistryDTO;
import com.example.Speedcam.Speedcam.exception.NotFoundException;
import com.example.Speedcam.Speedcam.repository.RegistryRepository;
import com.example.Speedcam.Speedcam.service.RegistryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
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
        List<RegistryDTO> registry= new ArrayList<>();
        List<Registry> r= registryRepository.findAll();


        for (Registry r2 : r) {
            RegistryDTO r3 = mapperDTO.RegistryToRegistryDTO(r2);
            registry.add(r3);
        }
        return registry;
    }

    @Override
    public Registry findRegistryById(Integer id)throws NotFoundException {
        Optional<Registry> r = registryRepository.findById(id);
        if(r.isEmpty()){
            throw new NotFoundException("Registry not found");
        }
        return r.get();
    }

    @Override
    public void update(Integer id, Registry r) throws NotFoundException {
        Registry registry = findRegistryById(id);
        if(registry==null){
            throw new NotFoundException("Registry not found");
        }
        registry.setName(r.getName());
        registry.setSurname(r.getSurname());
        registry.setDetail(r.getDetail());
        registryRepository.save(registry);
    }

    @Override
    public void delete(Integer id) throws NotFoundException {
        Registry r = findRegistryById(id);
        if(r==null){
            throw new NotFoundException("Registry not found");
        }
        registryRepository.delete(r);
    }
}
