

package com.example.employee.convertors;

import com.example.employee.domain.DepartmentDomain;
import com.example.employee.domain.EmployeeDomain;
import com.example.employee.model.Department;
import com.example.employee.model.Employee;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;

public class DepartmentToDepartmentCommand implements Converter<Department, DepartmentDomain> {

    @Synchronized
    @Nullable
    @Override
    public DepartmentDomain convert(Department source) {
        if (source == null) {
            return null;
        }

        final DepartmentDomain destination = new DepartmentDomain();
        destination.setId(source.getId());
        destination.setName(source.getName());
        return destination;
    }
}
