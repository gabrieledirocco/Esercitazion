package com.example.Speedcam.Speedcam.entity.mapperDTO;

import com.example.Speedcam.Speedcam.entity.Detail;
import com.example.Speedcam.Speedcam.entity.Fine;
import com.example.Speedcam.Speedcam.entity.Registry;
import com.example.Speedcam.Speedcam.entity.Speedcam;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MapperDTO {

    public DetailDTO DetailToDetailDto(Detail detail) {
        DetailDTO detailDTO = new DetailDTO();

        detailDTO.setId(detail.getId());
        detailDTO.setFiscalCode(detail.getFiscalCode());
        detailDTO.setPhoneNumber(detail.getPhoneNumber());
        detailDTO.setAddress(detail.getAddress());
        detailDTO.setRegistry(detail.getRegistry());

        return detailDTO;

    }

    public Detail DetailDTOToDetail(DetailDTO detailDTO) {
        Detail detail = new Detail();
        detail.setId(detailDTO.getId());
        detail.setFiscalCode(detailDTO.getFiscalCode());
        detail.setPhoneNumber(detailDTO.getPhoneNumber());
        detail.setAddress(detailDTO.getAddress());
        detail.setRegistry(detailDTO.getRegistry());

        return detail;
    }

    public List<DetailDTO> toDtoDetailList(List<Detail> detail) {
        if (detail == null) {
            return null;
        }
        List<DetailDTO> list = new ArrayList<>(detail.size());
        for (Detail d : detail) {
            list.add(DetailToDetailDto(d));
        }
        return list;
    }

    public FineDTO fineToFineDTO(Fine fine) {
        FineDTO fineDTO = new FineDTO();

        fineDTO.setId(fine.getId());
        fineDTO.setDate(fine.getDate());
        fineDTO.setDeadline(fine.getDeadline());

        return fineDTO;
    }

    public Fine FineDTOToFine(FineDTO fineDTO) {
        Fine fine = new Fine();
        fine.setId(fineDTO.getId());
        fine.setDate(fineDTO.getDate());
        fine.setDeadline(fineDTO.getDeadline());
        return fine;
    }

    public List<FineDTO> toDtoFineList(List<Fine> fine) {
        if (fine == null) {
            return null;
        }
        List<FineDTO> list = new ArrayList<>(fine.size());
        for (Fine f : fine) {
            list.add(fineToFineDTO(f));
        }
        return list;
    }

    public RegistryDTO RegistryToRegistryDTO(Registry registry) {
        RegistryDTO registryDTO = new RegistryDTO();
        registryDTO.setId(registry.getId());
        registryDTO.setName(registry.getName());
        registryDTO.setSurname(registry.getSurname());
        registryDTO.setDetail(registry.getDetail());
        return registryDTO;
    }
    public Registry RegystryDTOToRegistry(RegistryDTO registryDTO) {
        Registry registry = new Registry();
        registry.setId(registryDTO.getId());
        registry.setName(registryDTO.getName());
        registry.setSurname(registryDTO.getSurname());
        registry.setDetail(registryDTO.getDetail());
        return registry;
    }

    public List<RegistryDTO> toDtoRegistryList(List<Registry> registry) {
        if (registry == null) {
            return null;
        }
        List<RegistryDTO> list = new ArrayList<>(registry.size());
        for (Registry r : registry) {
            list.add(RegistryToRegistryDTO(r));
        }
        return list;
    }

    public SpeedcamDTO SpeedcamToSpeedcamDTO(Speedcam speedcam){
        SpeedcamDTO speedCamDTO = new SpeedcamDTO();
        speedCamDTO.setId(speedcam.getId());
        speedCamDTO.setLocation(speedcam.getLocation());
        return speedCamDTO;
    }

    public Speedcam SpeedcamDTOToSpeedcam(SpeedcamDTO speedcamDTO){
        Speedcam speedcam = new Speedcam();
        speedcam.setId(speedcamDTO.getId());
        speedcam.setLocation(speedcam.getLocation());
        return speedcam;
    }

    public List<SpeedcamDTO> toDtoSpeedcamList(List<Speedcam> speedcam) {
        if (speedcam == null) {
            return null;
        }
        List<SpeedcamDTO> list = new ArrayList<>(speedcam.size());
        for (Speedcam s : speedcam) {
            list.add(SpeedcamToSpeedcamDTO(s));
        }
        return list;
    }



}
