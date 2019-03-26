package com.example.employee.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Size;

@Getter
@Setter
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class DepartmentDomain {

    private int id;
    @Size(min = 3, max = 40)
    private String name;


}
