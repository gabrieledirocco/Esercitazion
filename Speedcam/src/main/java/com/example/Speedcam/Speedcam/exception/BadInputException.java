package com.example.Speedcam.Speedcam.exception;

import org.springframework.http.HttpStatus;

public class BadInputException extends Exception{
    public BadInputException() {
    }

    public BadInputException(String message) {
        super(message);
    }

    public BadInputException(String message, Throwable cause) {
        super(message, cause);
    }

    public BadInputException(Throwable cause) {
        super(cause);
    }

    public BadInputException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
