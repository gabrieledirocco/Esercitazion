package com.example.Speedcam.Speedcam.exception;

public class ApiError {
    private String message;
    private String error;
    private Integer status;

    public ApiError() {
    }

    public ApiError(String message, String error, Integer status) {
        this.message = message;
        this.error = error;
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
