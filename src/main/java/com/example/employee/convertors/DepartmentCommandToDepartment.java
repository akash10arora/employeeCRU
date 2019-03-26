package com.example.employee.convertors;

import com.example.employee.domain.DepartmentDomain;
import com.example.employee.domain.EmployeeDomain;
import com.example.employee.model.Department;
import com.example.employee.model.Employee;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;

import java.sql.Timestamp;

public class DepartmentCommandToDepartment implements Converter<DepartmentDomain, Department> {

    @Synchronized
    @Nullable
    @Override
    public Department convert(DepartmentDomain source) {
        if (source == null) {
            return null;
        }

        final Department destination = new Department();
        destination.setId(source.getId());
        destination.setName(source.getName());
        return destination;
    }
}
