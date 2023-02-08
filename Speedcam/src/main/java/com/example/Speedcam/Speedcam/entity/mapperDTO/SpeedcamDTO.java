package com.example.Speedcam.Speedcam.entity.mapperDTO;

public class SpeedcamDTO {
    private Integer id;
    private String location;

    public SpeedcamDTO() {
    }
    public SpeedcamDTO(Integer id, String location) {
        this.id = id;
        this.location = location;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
