package com.ironhack.netflix.repositories;

import com.ironhack.netflix.models.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

import java.util.*;

@Repository
public interface AccountRepository extends JpaRepository<Account, String> {
    List<Account> findByPlan(Plan plan);
}
