package com.example.Speedcam.Speedcam.exception.handler;

import com.example.Speedcam.Speedcam.exception.ApiError;
import com.example.Speedcam.Speedcam.exception.BadInputException;
import com.example.Speedcam.Speedcam.exception.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MyExceptionHandler {
    @ExceptionHandler(value = BadInputException.class)
    public ResponseEntity<ApiError> BadInputExceptionHandling(BadInputException ex) {
        ApiError apiError = new ApiError();
        apiError.setStatus(HttpStatus.NOT_FOUND.value());
        apiError.setMessage(ex.getMessage());
        apiError.setError("Bad input");
        return ResponseEntity.badRequest().body(apiError);
    }
    @ExceptionHandler(value = NotFoundException.class)
    public ResponseEntity<ApiError> NotFoundExceptionHandling(NotFoundException ex) {
        ApiError apiError = new ApiError();
        apiError.setStatus(HttpStatus.NOT_FOUND.value());
        apiError.setMessage(ex.getMessage());
        apiError.setError("Not Found");
        return ResponseEntity.badRequest().body(apiError);
    }

    @ExceptionHandler({Exception.class, RuntimeException.class})
    public ResponseEntity<ApiError> GenericException(Exception ex) {
        int statuscode = HttpStatus.INTERNAL_SERVER_ERROR.value();
        ApiError apiError = new ApiError();
        apiError.setStatus(HttpStatus.NOT_FOUND.value());
        apiError.setMessage(ex.getMessage());
        apiError.setError("Generic error");
        return ResponseEntity.status(statuscode).body(apiError);
    }


}
