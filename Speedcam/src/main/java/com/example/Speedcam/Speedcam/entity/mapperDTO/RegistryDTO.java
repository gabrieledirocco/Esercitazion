package com.example.Speedcam.Speedcam.entity.mapperDTO;

import com.example.Speedcam.Speedcam.entity.Detail;

public class RegistryDTO {
    private Integer id;
    private String name;
    private String surname;
    private Detail detail;

    public RegistryDTO() {
    }

    public RegistryDTO(Integer id, String name, String surname, Detail detail) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.detail = detail;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Detail getDetail() {
        return detail;
    }

    public void setDetail(Detail detail) {
        this.detail = detail;
    }




}
