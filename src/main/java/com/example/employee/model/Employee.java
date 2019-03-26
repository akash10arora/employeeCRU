package com.example.employee.model;

import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.sql.Timestamp;

@lombok.Data
@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name") private String name;

    @Column(name = "hire_date") private Timestamp hireDate;

    @Column(name = "birth_date") private Timestamp birthDate;

    @Column(name = "gender") private String gender;

    @ManyToOne
    @JoinColumn
    private Department department;


}
