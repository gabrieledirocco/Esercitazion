package com.example.Speedcam.Speedcam.entity;

import javax.persistence.*;
import java.util.List;

public class Speedcam {


    @Id
    @Column(name="id")
    private int id;
    @Column(name="location")
    private String location;
    @OneToMany(mappedBy = "speedcam")
    private List<Fine> fineList;

}
