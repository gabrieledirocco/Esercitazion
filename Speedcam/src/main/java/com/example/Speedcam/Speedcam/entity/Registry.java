package com.example.Speedcam.Speedcam.entity;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "registry")
public class Registry {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "surname", nullable = false)
    private String surname;
    @OneToOne(cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "id_detail")
    private Detail detail;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "registry", cascade = CascadeType.ALL)
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
