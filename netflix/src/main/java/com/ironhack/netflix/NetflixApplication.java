package com.ironhack.netflix;

import com.ironhack.netflix.models.*;
import com.ironhack.netflix.repositories.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

@SpringBootApplication
public class NetflixApplication implements CommandLineRunner {

	Scanner input = new Scanner(System.in);
	@Autowired
	PlanRepository planRepository;

	public static void main(String[] args) {
		SpringApplication.run(NetflixApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hola Clase!");
		System.out.println("Introduce el nombre del plan");
		String in = input.nextLine();
		Plan plan = planRepository.save(new Plan(in, 25.0));




	}
}
