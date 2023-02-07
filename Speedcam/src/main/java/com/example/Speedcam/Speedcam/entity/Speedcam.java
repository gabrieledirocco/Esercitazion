package com.example.Speedcam.Speedcam.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "speedcam")
public class Speedcam {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "location", nullable = false)
    private String location;
    @OneToMany(mappedBy = "speedcam", cascade = CascadeType.ALL)
    private List<Fine> fineList;

    public Speedcam() {
    }

    public Speedcam(int id, String location, List<Fine> fineList) {
        this.id = id;
        this.location = location;
        this.fineList = fineList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Fine> getFineList() {
        return fineList;
    }

    public void setFineList(List<Fine> fineList) {
        this.fineList = fineList;
    }
}
