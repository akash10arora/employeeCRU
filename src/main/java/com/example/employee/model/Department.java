package com.example.employee.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;


@Getter
@Setter
@Entity
@Table(name = "department")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name") private String name;

    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
    private Set<Employee> employeeSet;
}
