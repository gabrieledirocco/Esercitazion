package com.example.Speedcam.Speedcam.service.impl;

import com.example.Speedcam.Speedcam.entity.Fine;
import com.example.Speedcam.Speedcam.entity.mapperDTO.FineDTO;
import com.example.Speedcam.Speedcam.entity.mapperDTO.MapperDTO;
import com.example.Speedcam.Speedcam.exception.NotFoundException;
import com.example.Speedcam.Speedcam.repository.FineRepository;
import com.example.Speedcam.Speedcam.service.FineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
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
//        fineRepository.save(fine);
        return fineRepository.save(fine);

    }

    @Override
    public List<FineDTO> getAllFine() {
        List<Fine> fineList = fineRepository.findAll();

        if (fineList == null) {
            return null;
        }
        List<FineDTO> fineDTOList = new ArrayList<>();
        for (Fine fine : fineList) {
            fineDTOList.add(mapperDTO.fineToFineDTO(fine));
        }
        return fineDTOList;
    }

    @Override
    public Fine findFineById(Integer id) throws NotFoundException {
        Optional<Fine> f = fineRepository.findById(id);
        if (f.isEmpty()) {
            throw new NotFoundException("Fine with incorrect id");
        }
        return f.get();
    }

    @Override
    public void update(Integer id, Fine f) throws NotFoundException {
        Fine fine = findFineById(id);
        if (fine == null) {
            throw new NotFoundException("Fine with incorrect id");
        }
        fine.setDate(f.getDate());
        fine.setDeadline(f.getDeadline());
        fineRepository.save(fine);
    }

    @Override
    public void delete(Integer id) throws NotFoundException {
        Fine f = findFineById(id);
        if (f == null) {
            throw new NotFoundException("Fine with incorrect id");
        }
        fineRepository.delete(f);
    }
}
