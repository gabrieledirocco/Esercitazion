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
        return registryRepository.save(registry);
    }

    @Override
    public List<RegistryDTO> getAllRegistry() {
        List<Registry> registryList = registryRepository.findAll();

        if (registryList == null) {
            return null;
        }
        List<RegistryDTO> registryDTOList = new ArrayList<>();
        for (Registry registry : registryList) {
            registryDTOList.add(mapperDTO.registryToRegistryDTO(registry));
        }
        return registryDTOList;
    }

    @Override
    public Registry findRegistryById(Integer id) throws NotFoundException {
        Optional<Registry> r = registryRepository.findById(id);
        if (r.isEmpty()) {
            throw new NotFoundException("Registry not found");
        }
        return r.get();
    }

    @Override
    public void update(Integer id, Registry r) throws NotFoundException {
        Registry registry = findRegistryById(id);
        if (registry == null) {
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
        if (r == null) {
            throw new NotFoundException("Registry not found");
        }
        registryRepository.delete(r);
    }
}
