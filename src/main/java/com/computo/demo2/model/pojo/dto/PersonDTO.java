package com.computo.demo2.model.pojo.dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
@Getter
@Setter
public class PersonDTO {
    private String name;
    private String lastName;
    private String document;
}
