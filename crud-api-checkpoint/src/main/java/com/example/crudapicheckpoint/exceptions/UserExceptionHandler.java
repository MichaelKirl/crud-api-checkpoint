package com.example.crudapicheckpoint.exceptions;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Map;
import java.util.NoSuchElementException;

@ControllerAdvice
public class UserExceptionHandler {
//    @ExceptionHandler(value = {EmptyResultDataAccessException.class, NullPointerException.class})
//    public ResponseEntity<String> catchNoElementException() {
//        return new ResponseEntity<>("It aint here", HttpStatus.NOT_FOUND);
//    }

    @ExceptionHandler(value = {NoSuchElementException.class, EmptyResultDataAccessException.class, NullPointerException.class})
    public Map<String, Boolean> catchNullObject() {
        return Map.of("authenticated", false);
    }


}
