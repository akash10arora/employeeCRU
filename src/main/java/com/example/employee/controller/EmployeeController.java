package com.example.employee.controller;

import com.example.employee.domain.EmployeeDomain;
import com.example.employee.services.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@Slf4j
@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employee/{id}")
    public EmployeeDomain getEmployeeById(@PathVariable String id) {
        return employeeService.getEmployeeById(new Integer(id));
    }

    @GetMapping("/employee/")
    public Set<EmployeeDomain> getAllEmployees() {
        return employeeService.getEmployees();
    }

    @PostMapping("/employee/")
    public String insertEmployee(@RequestBody EmployeeDomain employeeDomain) {
        employeeService.insertEmployee(employeeDomain);
        return "Successfully added employee!!";
    }

    @PutMapping("/employee/")
    public String updateEmployee(@RequestBody EmployeeDomain employeeDomain) {
        employeeService.updateEmployee(employeeDomain);
        return "Successfully updated employee!!";
    }
}
