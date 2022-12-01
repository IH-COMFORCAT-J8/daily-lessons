package com.ironhack.IHJavaWeek4Day4Security.repository;

import com.ironhack.IHJavaWeek4Day4Security.models.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}
