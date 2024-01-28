package net.javaguides.springbootbackend.controller;

import net.javaguides.springbootbackend.model.Employee;
import net.javaguides.springbootbackend.repository.EmployeeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RequestMapping("/api/v1/employees")
@RestController
public class EmployeeController {

    @Autowired
    private EmployeeeRepository employeeeRepository;
@GetMapping
    public List<Employee> getAllEmployees()
    {
        return employeeeRepository.findAll();
    }
}
