package com.ironhack.lab402.repositories;

import com.ironhack.lab402.models.Patient;
import com.ironhack.lab402.models.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {

    List<Patient> findBydateOfBirthBetween(LocalDate start, LocalDate end);

    List<Patient> findByAdmittedByDepartment(String department);

    List<Patient> findByAdmittedByStatus(Status status);
}
