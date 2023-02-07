package com.example.Speedcam.Speedcam.entity;


import javax.persistence.*;
import java.util.List;

@Entity
public class Registry {
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_detail")
    private Detail detail;

    @OneToMany
    private List<Fine> fineList;

    public Registry(Integer id, String name, String surname, Detail detail) {
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
