package com.ironhack.lab402.controllers;

import com.ironhack.lab402.models.Patient;
import com.ironhack.lab402.models.Status;
import com.ironhack.lab402.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
public class PatientController {

    @Autowired
    PatientRepository patientRepository;

    @GetMapping("/patients")
    @ResponseStatus(HttpStatus.OK)
    public List<Patient> findAllPatients(){
        return patientRepository.findAll();
    }

    @GetMapping("/patients/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Patient findPatientById(@PathVariable Long id){
        if(patientRepository.findById(id).isPresent()){
            return patientRepository.findById(id).get();
        }
        return null;
    }

    @GetMapping("/patients-dob")
    @ResponseStatus(HttpStatus.OK)
    public List<Patient> findByDobBetween(@RequestParam LocalDate start, @RequestParam LocalDate end){
        return patientRepository.findBydateOfBirthBetween(start, end);
    }

    @GetMapping("/patients-department/{department}")
    @ResponseStatus(HttpStatus.OK)
    public List<Patient> findPatientsByDepartment(@PathVariable String department){
        return patientRepository.findByAdmittedByDepartment(department);
    }

    @GetMapping("/patients-status/{status}")
    @ResponseStatus(HttpStatus.OK)
    public List<Patient> findPatientsByStatus(@PathVariable Status status){
        return patientRepository.findByAdmittedByStatus(status);
    }



}
