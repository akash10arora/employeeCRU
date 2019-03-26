

package com.example.employee.convertors;

import com.example.employee.domain.EmployeeDomain;
import com.example.employee.model.Employee;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;

public class EmployeeToEmployeeCommand implements Converter<Employee, EmployeeDomain> {

    @Synchronized
    @Nullable
    @Override
    public EmployeeDomain convert(Employee source) {
        if (source == null) {
            return null;
        }

        final EmployeeDomain destination = new EmployeeDomain();
        destination.setId(source.getId());
        destination.setName(source.getName());
        destination.setBirthDate(source.getBirthDate().toString());
        destination.setGender(source.getGender());
        destination.setHireDate(source.getHireDate().toString());
        DepartmentToDepartmentCommand converter = new DepartmentToDepartmentCommand();
        destination.setDepartment(converter.convert(source.getDepartment()));
        //destination.setDepartmentId(source.getDepartmentId());
        return destination;
    }
}
