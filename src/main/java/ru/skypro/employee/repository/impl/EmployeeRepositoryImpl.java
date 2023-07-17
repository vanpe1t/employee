package ru.skypro.employee.repository.impl;

import org.springframework.stereotype.Repository;
import ru.skypro.employee.model.Employee;
import ru.skypro.employee.repository.EmployeeRepository;

import java.util.List;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository {

    private final List<Employee> employeeList = List.of(
            new Employee("Катя", 90_000),
            new Employee("Дима", 102_000),
            new Employee("Олег", 80_000),
            new Employee("Вика", 165_000));
    @Override
    public List<Employee> getAllEmployees() {
        return employeeList;
    }
}
