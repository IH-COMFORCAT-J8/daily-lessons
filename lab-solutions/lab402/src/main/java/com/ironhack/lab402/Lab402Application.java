package com.ironhack.lab402;

import com.ironhack.lab402.models.Employee;
import com.ironhack.lab402.models.Patient;
import com.ironhack.lab402.models.Status;
import com.ironhack.lab402.repositories.EmployeeRepository;
import com.ironhack.lab402.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class Lab402Application implements CommandLineRunner {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	PatientRepository patientRepository;

	public static void main(String[] args) {
		SpringApplication.run(Lab402Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {


		Employee employee1 = new Employee(356712L, "cardiology", "Alonso Flores", Status.ON_CALL);
		Employee employee2 = new Employee(564134L, "immunology", "Sam Ortega", Status.ON);
		Employee employee3 = new Employee(761527L, "cardiology", "German Ruiz", Status.OFF);
		Employee employee4 = new Employee(166552L, "pulmonary", "Maria Lin", Status.ON);
		Employee employee5 = new Employee(156545L, "orthopaedic", "Paolo Rodriguez", Status.ON_CALL);
		Employee employee6 = new Employee(172456L, "psychiatric", "John Paul Armes", Status.OFF);

		employeeRepository.saveAll(List.of(employee1, employee2, employee3, employee4, employee5, employee6 ));


		Patient patient1 = new Patient(1L, "Jaime Jordan", LocalDate.of(1984,03,02), employee2);
		Patient patient2 = new Patient(2L , "Marian Garcia", LocalDate.of(1972,01,12), employee2);
		Patient patient3 = new Patient(3L, "Julia Dusterdieck", LocalDate.of(1954, 06, 11), employee2);
		Patient patient4 = new Patient(4L, "Steve McDuck", LocalDate.of(1931, 11,10), employee3);
		Patient patient5 = new Patient(5L, "Marian Garcia", LocalDate.of(1999, 02,15), employee6);

		patientRepository.saveAll(List.of(patient1, patient2, patient3, patient4, patient5));
	}
}
