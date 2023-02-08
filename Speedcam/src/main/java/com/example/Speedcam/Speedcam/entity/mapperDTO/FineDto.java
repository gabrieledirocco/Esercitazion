package com.example.Speedcam.Speedcam.entity.mapperDTO;

import com.example.Speedcam.Speedcam.entity.Registry;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class FineDto {
    private Integer id;
    private LocalDateTime date;
    private LocalDate deadline;

    public FineDto() {
    }

    public FineDto(Integer id, LocalDateTime date, LocalDate deadline) {
        this.id = id;
        this.date = date;
        this.deadline = deadline;
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
}
