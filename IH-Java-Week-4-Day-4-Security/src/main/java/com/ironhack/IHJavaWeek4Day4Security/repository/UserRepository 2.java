package com.ironhack.IHJavaWeek4Day4Security.repository;

import com.ironhack.IHJavaWeek4Day4Security.models.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

import java.util.*;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByUsername(String username);
}
