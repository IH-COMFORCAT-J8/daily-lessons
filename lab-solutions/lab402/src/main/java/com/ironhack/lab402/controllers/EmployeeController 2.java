package com.ironhack.lab402.controllers;

import com.ironhack.lab402.models.Employee;
import com.ironhack.lab402.models.Status;
import com.ironhack.lab402.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

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

        return employeeRepository.findById(id)
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND, "The user does not exist"));
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

    @PostMapping("/create-doctor")
    @ResponseStatus(HttpStatus.CREATED)
    public Employee createEmpoloyee(@RequestBody Employee employee){
        return employeeRepository.save(employee);
    }

    @PatchMapping("/doctor-status/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Employee updateStatus(@PathVariable Long id, @RequestParam Status status){

        Employee employee = employeeRepository.findById(id)
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND, "Employee not found"));
        employee.setStatus(status);
        return employeeRepository.save(employee);


    }

    @PatchMapping("/doctor-department/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Employee updateDepartment(@PathVariable Long id, @RequestParam String department){
        if(employeeRepository.findById(id).isPresent()){
            Employee employee = employeeRepository.findById(id).get();
            employee.setDepartment(department);
            return employeeRepository.save(employee);
        }
        return null;
    }




}
