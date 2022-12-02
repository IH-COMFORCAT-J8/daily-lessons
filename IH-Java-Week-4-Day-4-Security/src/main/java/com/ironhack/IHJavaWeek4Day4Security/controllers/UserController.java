package com.ironhack.IHJavaWeek4Day4Security.controllers;

import com.ironhack.IHJavaWeek4Day4Security.models.*;
import com.ironhack.IHJavaWeek4Day4Security.models.User;
import com.ironhack.IHJavaWeek4Day4Security.repository.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.security.core.annotation.*;
import org.springframework.security.core.userdetails.*;
import org.springframework.security.crypto.password.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    @Autowired
    RoleRepository roleRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    @GetMapping("/say-hi")
    public String sayHi() {
        return "Hola!!!";
    }

    @PostMapping("/create-user")
    public void createUser(@RequestBody User user) {
        String encodedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);
        user = userRepository.save(user);
        Role role = roleRepository.save(new Role("USER", user));

    }

    @PostMapping("/create-admin-user")
    public void createAdminUser(@RequestBody User user) {
        String encodedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);
        user = userRepository.save(user);
        Role role1 = roleRepository.save(new Role("USER", user));
        Role role2 = roleRepository.save(new Role("ADMIN", user));

    }

    @GetMapping("user-area")
    public String showUserArea() {
        return "Estás en el area solo para usuarios";
    }

    @GetMapping("user-admin-area/admin")
    public String showAdminArea() {
        return "Estás en el area solo para administradores";
    }


    @GetMapping("/user-details")
    public User getUserDetails(@AuthenticationPrincipal UserDetails userDetails, @PathVariable(name = "id") Long id) {
        return userRepository.findByUsername(userDetails.getUsername()).get();
    }

}
