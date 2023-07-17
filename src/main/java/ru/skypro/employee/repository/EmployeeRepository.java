package ru.skypro.employee.repository;

import org.springframework.stereotype.Repository;
import ru.skypro.employee.model.Employee;

import java.util.List;

@Repository
public interface EmployeeRepository {
    public List<Employee> getAllEmployees();

}
