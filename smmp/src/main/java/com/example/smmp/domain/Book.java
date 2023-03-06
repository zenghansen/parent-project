package com.example.smmp.domain;

import lombok.Data;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Max;

@Data
@Validated
public class Book {
    @Max(value = 2,message = "最大值不能超过2")
    private Integer id;
    private String type;
    private String name;
    private String description;
}
