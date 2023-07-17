package ru.skypro.employee.service.impl;


import org.springframework.stereotype.Service;
import ru.skypro.employee.model.Employee;
import ru.skypro.employee.repository.EmployeeRepository;
import ru.skypro.employee.service.EmployeeService;

import java.util.Comparator;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public int getMaxSalary() {

        List<Employee> employeeList = employeeRepository.getAllEmployees();

        return employeeList.stream()
                .max(Comparator.comparingInt(Employee::getSalary))
                .get().getSalary();
    }

    @Override
    public int getMinSalary() {
        List<Employee> employeeList = employeeRepository.getAllEmployees();

        return employeeList.stream()
                .min(Comparator.comparingInt(Employee::getSalary))
                .get().getSalary();
    }

    @Override
    public int getTotalSalary() {
        List<Employee> employeeList = employeeRepository.getAllEmployees();

        return employeeList.stream()
                .mapToInt(Employee::getSalary).sum();
    }

    @Override
    public List<Employee> getListEmployeesWithSalaryMoreThanAvrg() {
        List<Employee> employeeList = employeeRepository.getAllEmployees();

        double avrg = employeeList.stream().mapToInt(Employee::getSalary).average().orElse(0.0);

        return employeeList.stream().filter(employee -> employee.getSalary() > avrg).toList();
    }
}
