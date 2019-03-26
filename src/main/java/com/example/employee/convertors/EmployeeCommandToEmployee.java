package com.example.employee.convertors;

import com.example.employee.domain.EmployeeDomain;
import com.example.employee.model.Employee;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;

import java.sql.Timestamp;

public class EmployeeCommandToEmployee implements Converter<EmployeeDomain, Employee> {

    @Synchronized
    @Nullable
    @Override
    public Employee convert(EmployeeDomain source) {
        if (source == null) {
            return null;
        }

        final Employee destination = new Employee();
        destination.setId(source.getId());
        destination.setName(source.getName());
        destination.setBirthDate(Timestamp.valueOf(source.getBirthDate()));
        destination.setGender(source.getGender());
        destination.setHireDate(Timestamp.valueOf(source.getHireDate()));
        DepartmentCommandToDepartment departmentCommandToDepartment = new DepartmentCommandToDepartment();
        destination.setDepartment(departmentCommandToDepartment.convert(source.getDepartment()));
        //destination.setDepartmentId(source.getDepartmentId());
        return destination;
    }
}
