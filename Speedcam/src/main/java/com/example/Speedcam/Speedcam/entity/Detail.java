package com.example.Speedcam.Speedcam.entity;


import javax.persistence.*;

@Entity
public class Detail {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "fiscal_code")
    private String fiscalCode;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "address")
    private String address;
    @OneToOne(mappedBy = "registry", cascade = CascadeType.ALL)
    private Registry registry;

    public Detail() {
    }

    public Detail(Integer id, String fiscalCode, String phoneNumber, String address) {
        this.id = id;
        this.fiscalCode = fiscalCode;
        this.phoneNumber = phoneNumber;
        this.address = address;
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
}
