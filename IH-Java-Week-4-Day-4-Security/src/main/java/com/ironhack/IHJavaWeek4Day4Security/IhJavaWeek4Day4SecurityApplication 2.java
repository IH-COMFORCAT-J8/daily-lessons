package com.ironhack.IHJavaWeek4Day4Security;

import com.ironhack.IHJavaWeek4Day4Security.models.*;
import com.ironhack.IHJavaWeek4Day4Security.repository.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.*;

@SpringBootApplication
public class IhJavaWeek4Day4SecurityApplication implements CommandLineRunner {

	@Autowired
	UserRepository userRepository;

	@Autowired
	RoleRepository roleRepository;

	@Autowired
	PasswordEncoder passwordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(IhJavaWeek4Day4SecurityApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		User user1 = userRepository.save(new User("Jaume", passwordEncoder.encode("123456")));
		User user2 = userRepository.save(new User("Alejandro", passwordEncoder.encode("abcde")));

		roleRepository.save(new Role("USER", user1));
		roleRepository.save(new Role("USER", user2));
		roleRepository.save(new Role("ADMIN", user2));



	}
}
