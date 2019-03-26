package com.example.employee.services;

import com.example.employee.domain.EmployeeDomain;
import com.example.employee.convertors.EmployeeCommandToEmployee;
import com.example.employee.convertors.EmployeeToEmployeeCommand;
import com.example.employee.model.Employee;
import com.example.employee.repositories.EmployeeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;


import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Slf4j
@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Set<EmployeeDomain> getEmployees() {
        Set<Employee> employeeSet = new HashSet<>();
        employeeRepository.findAll().iterator().forEachRemaining(employeeSet::add);

        Set<EmployeeDomain> resultSet = new HashSet<>();

        EmployeeDomain command;
        for (Employee employee: employeeSet) {
            EmployeeToEmployeeCommand converter = new EmployeeToEmployeeCommand();
            command = converter.convert(employee);
            resultSet.add(command);
        }
        return resultSet;
    }

    @Override
    public EmployeeDomain getEmployeeById(int id) {
        Optional<Employee> employeeOptional = employeeRepository.findById(id);
        if (!employeeOptional.isPresent()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Employee Not Found for given ID");
        }
        EmployeeToEmployeeCommand converter = new EmployeeToEmployeeCommand();
        EmployeeDomain result = converter.convert(employeeOptional.get());
        return result;
    }

    @Override
    public void insertEmployee(EmployeeDomain employeeDomain) {
        EmployeeCommandToEmployee converter = new EmployeeCommandToEmployee();
        Employee employee = converter.convert(employeeDomain);
        employeeRepository.save(employee);
    }

    @Override
    public void updateEmployee(EmployeeDomain employeeDomain) {
        EmployeeCommandToEmployee converter = new EmployeeCommandToEmployee();
        Employee employee = converter.convert(employeeDomain);
        employeeRepository.save(employee);
    }
}
