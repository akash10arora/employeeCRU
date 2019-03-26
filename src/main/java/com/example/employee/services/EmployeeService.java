package com.example.employee.services;

import com.example.employee.domain.EmployeeDomain;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public interface EmployeeService {

    Set<EmployeeDomain> getEmployees();

    EmployeeDomain getEmployeeById(int id);

    void insertEmployee(EmployeeDomain employeeDomain);

    void updateEmployee(EmployeeDomain employeeDomain);

}

