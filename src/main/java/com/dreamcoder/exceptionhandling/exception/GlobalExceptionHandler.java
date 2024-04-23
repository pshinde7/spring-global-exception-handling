package com.dreamcoder.exceptionhandling.exception;


import com.dreamcoder.exceptionhandling.model.ErrorMessage;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(InvalidProductId.class)
    public ResponseEntity<ErrorMessage> InvalidProductId(HttpServletRequest request, InvalidProductId invalidProductId) {
        ErrorMessage errorMessage = ErrorMessage.builder().error(invalidProductId.getMessage())
                .statusCode(HttpStatus.BAD_REQUEST.toString())
                .build();
        return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
    }
}
