package ru.skypro.employee.service;

import org.springframework.aop.target.LazyInitTargetSource;
import org.springframework.stereotype.Service;
import ru.skypro.employee.model.Employee;

import java.util.List;

@Service
public interface EmployeeService {

    public int getMaxSalary();

    public int getMinSalary();

    public int getTotalSalary();

    public List<Employee> getListEmployeesWithSalaryMoreThanAvrg();

}
