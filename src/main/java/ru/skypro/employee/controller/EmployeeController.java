package ru.skypro.employee.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.skypro.employee.model.Employee;
import ru.skypro.employee.service.EmployeeService;

import java.util.List;

@RestController
@RequestMapping("employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/salary/max")
    public int getMaxSalary() {
        return employeeService.getMaxSalary();
    }

    @GetMapping("/salary/min")
    public int getMinSalary() {
        return employeeService.getMinSalary();
    }

    @GetMapping("/salary/sum")
    public int getTotalSalary() {
        return employeeService.getTotalSalary();
    }

    @GetMapping("/salary/high-salary")
    public ResponseEntity<List<Employee>> getListEmployeesWithSalaryMoreThanAvrg() {
        return ResponseEntity.ok(employeeService.getListEmployeesWithSalaryMoreThanAvrg());
    }

}


