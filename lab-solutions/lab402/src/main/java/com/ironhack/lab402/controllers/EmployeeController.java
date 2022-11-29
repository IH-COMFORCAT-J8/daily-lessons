package com.ironhack.lab402.controllers;

import com.ironhack.lab402.models.Employee;
import com.ironhack.lab402.models.Status;
import com.ironhack.lab402.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping("/employees")
    @ResponseStatus(HttpStatus.OK)
    public List<Employee> findAllEmployees(){
        return employeeRepository.findAll();
    }

    @GetMapping("/employees/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Employee findEmployeeById(@PathVariable Long id){
        if(employeeRepository.findById(id).isPresent()){
            return employeeRepository.findById(id).get();
        }
        return null;
    }

    @GetMapping("/employees-status")
    @ResponseStatus(HttpStatus.OK)
    public List<Employee> findEmployeeByStatus(@RequestParam Status status){
        return employeeRepository.findByStatus(status);
    }

    @GetMapping("/employees-department")
    @ResponseStatus(HttpStatus.OK)
    public List<Employee> findEmployeesByDepartment(@RequestParam String department){
        return employeeRepository.findByDepartment(department);
    }
}
