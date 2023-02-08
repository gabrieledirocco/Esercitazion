package com.example.Speedcam.Speedcam.entity.mapperDTO;

import com.example.Speedcam.Speedcam.entity.Registry;

public class DetailDto {
    private Integer id;
    private String fiscalCode;
    private String phoneNumber;
    private String address;
    private Registry registry;

    public DetailDto() {

    }

    public DetailDto(Integer id, String fiscalCode, String phoneNumber, String address, Registry registry) {
        this.id = id;
        this.fiscalCode = fiscalCode;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.registry = registry;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFiscalCode() {
        return fiscalCode;
    }

    public void setFiscalCode(String fiscalCode) {
        this.fiscalCode = fiscalCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Registry getRegistry() {
        return registry;
    }

    public void setRegistry(Registry registry) {
        this.registry = registry;
    }
}
