package com.example.smmp.controller.utlis;

import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@RestControllerAdvice
public class ProjectException {

    @ExceptionHandler(value = BindException.class)
    public R rRxception(BindException ex){

        List<FieldError> fieldErrors = ex.getBindingResult().getFieldErrors();
        String errorMsg = fieldErrors.stream()
                .map(fieldError -> fieldError.getField() + ":" + fieldError.getDefaultMessage())
                .collect(Collectors.joining(","));

        return new R(false,errorMsg);

    }
    @ExceptionHandler()
    public R rRxception(Exception ex){

        return new R(false,ex.getMessage());

    }

}
