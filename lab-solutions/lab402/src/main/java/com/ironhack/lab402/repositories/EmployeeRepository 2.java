package com.ironhack.lab402.repositories;

import com.ironhack.lab402.models.Employee;
import com.ironhack.lab402.models.Patient;
import com.ironhack.lab402.models.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    List<Employee> findByStatus(Status status);
    List<Employee> findByDepartment(String department);

}
