package com.example.Speedcam.Speedcam.entity.mapperDTO;

import com.example.Speedcam.Speedcam.entity.Detail;
import com.example.Speedcam.Speedcam.entity.Fine;
import com.example.Speedcam.Speedcam.entity.Registry;
import com.example.Speedcam.Speedcam.entity.Speedcam;
import org.springframework.stereotype.Component;

@Component
public class MapperDTO {

    public DetailDTO detailToDetailDto(Detail detail) {
        DetailDTO detailDTO = new DetailDTO();

        detailDTO.setId(detail.getId());
        detailDTO.setFiscalCode(detail.getFiscalCode());
        detailDTO.setPhoneNumber(detail.getPhoneNumber());
        detailDTO.setAddress(detail.getAddress());
        detailDTO.setRegistry(detail.getRegistry());

        return detailDTO;

    }

    public Detail detailDTOToDetail(DetailDTO detailDTO) {
        Detail detail = new Detail();
        detail.setId(detailDTO.getId());
        detail.setFiscalCode(detailDTO.getFiscalCode());
        detail.setPhoneNumber(detailDTO.getPhoneNumber());
        detail.setAddress(detailDTO.getAddress());
        detail.setRegistry(detailDTO.getRegistry());

        return detail;
    }



    public FineDTO fineToFineDTO(Fine fine) {
        FineDTO fineDTO = new FineDTO();

        fineDTO.setId(fine.getId());
        fineDTO.setDate(fine.getDate());
        fineDTO.setDeadline(fine.getDeadline());

        return fineDTO;
    }

    public Fine fineDTOToFine(FineDTO fineDTO) {
        Fine fine = new Fine();
        fine.setId(fineDTO.getId());
        fine.setDate(fineDTO.getDate());
        fine.setDeadline(fineDTO.getDeadline());
        return fine;
    }

    public RegistryDTO registryToRegistryDTO(Registry registry) {
        RegistryDTO registryDTO = new RegistryDTO();
        registryDTO.setId(registry.getId());
        registryDTO.setName(registry.getName());
        registryDTO.setSurname(registry.getSurname());
        registryDTO.setDetail(registry.getDetail());
        return registryDTO;
    }
    public Registry regystryDTOToRegistry(RegistryDTO registryDTO) {
        Registry registry = new Registry();
        registry.setId(registryDTO.getId());
        registry.setName(registryDTO.getName());
        registry.setSurname(registryDTO.getSurname());
        registry.setDetail(registryDTO.getDetail());
        return registry;
    }

    public SpeedcamDTO speedcamToSpeedcamDTO(Speedcam speedcam){
        SpeedcamDTO speedCamDTO = new SpeedcamDTO();
        speedCamDTO.setId(speedcam.getId());
        speedCamDTO.setLocation(speedcam.getLocation());
        return speedCamDTO;
    }

    public Speedcam speedcamDTOToSpeedcam(SpeedcamDTO speedcamDTO){
        Speedcam speedcam = new Speedcam();
        speedcam.setId(speedcamDTO.getId());
        speedcam.setLocation(speedcam.getLocation());
        return speedcam;
    }




}
