package com.example.demoservice.controller.advice;

import com.example.demoservice.dto.base.ErrorDetailsDto;
import com.example.demoservice.exception.DataNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;

@Slf4j
public class BaseServiceExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler({DataNotFoundException.class})
    public final ResponseEntity<ErrorDetailsDto> handleDataNotFoundException(Exception ex, WebRequest request) {
        log.error(ex.getMessage(), ex);
        // @formatter:off
        ErrorDetailsDto errorDetails = ErrorDetailsDto
                .builder()
                .timestamp(new Date())
                .status(HttpStatus.NOT_FOUND.value())
                .message(ex.getMessage())
                .details(request.getDescription(false))
                .build();
        // @formatter:on
        return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
    }
}
