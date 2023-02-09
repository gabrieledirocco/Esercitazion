package com.example.Speedcam.Speedcam.entity;


import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "fine")
public class Fine {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "date", nullable = false)
    private LocalDateTime date;
    @Column(name = "dead_line", nullable = false)
    private LocalDate deadline;

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_speedcam")
    private Speedcam speedcam;

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_registry")
    private Registry registry;

    public Fine() {
    }


    public Fine(Integer id, LocalDateTime date, LocalDate deadline, Speedcam speedcam, Registry registry) {
        this.id = id;
        this.date = date;
        this.deadline = deadline;
        this.speedcam = speedcam;
        this.registry = registry;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    public Speedcam getSpeedcam() {
        return speedcam;
    }

    public void setSpeedcam(Speedcam speedcam) {
        this.speedcam = speedcam;
    }

    public Registry getRegistry() {
        return registry;
    }

    public void setRegistry(Registry registry) {
        this.registry = registry;
    }
}
