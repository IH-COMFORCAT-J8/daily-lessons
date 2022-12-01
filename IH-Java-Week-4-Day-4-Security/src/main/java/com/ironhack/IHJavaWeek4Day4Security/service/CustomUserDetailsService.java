package com.ironhack.IHJavaWeek4Day4Security.service;

import com.ironhack.IHJavaWeek4Day4Security.models.*;
import com.ironhack.IHJavaWeek4Day4Security.models.User;
import com.ironhack.IHJavaWeek4Day4Security.repository.*;
import com.ironhack.IHJavaWeek4Day4Security.security.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.security.core.userdetails.*;
import org.springframework.stereotype.*;

import java.util.*;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> user = userRepository.findByUsername(username);

        if (!user.isPresent()) {
            throw new UsernameNotFoundException("El usuario no existe");
        }

        CustomUserDetails customUserDetails = new CustomUserDetails(user.get());

        return customUserDetails;

    }
}
