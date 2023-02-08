package com.example.Speedcam.Speedcam.service.impl;

import com.example.Speedcam.Speedcam.entity.Fine;
import com.example.Speedcam.Speedcam.entity.mapperDTO.FineDTO;
import com.example.Speedcam.Speedcam.entity.mapperDTO.MapperDTO;
import com.example.Speedcam.Speedcam.repository.FineRepository;
import com.example.Speedcam.Speedcam.service.FineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class FineServiceImpl implements FineService {
    @Autowired
    private FineRepository fineRepository;
    @Autowired
    private MapperDTO mapperDTO;
    @Override
    public Fine create(Fine fine) {
        fineRepository.save(fine);
        return fine;
    }

    @Override
    public List<FineDTO> getAllFine() {
        return this.mapperDTO.toDtoFineList(fineRepository.findAll());
    }

    @Override
    public Fine findFineById(Integer id) {
        Optional<Fine> f = fineRepository.findById(id);
        if(f.isEmpty()){
        }
        return f.get();
    }

    @Override
    public void updateFine(Integer id, Fine f) {
        Fine fine = findFineById(id);
        if(fine==null){

        }
        fine.setDate(f.getDate());
        fine.setDeadline(f.getDeadline());
        fineRepository.save(fine);
    }

    @Override
    public void deleteFine(Integer id) {
        Fine f = findFineById(id);
        fineRepository.delete(f);
    }
}
