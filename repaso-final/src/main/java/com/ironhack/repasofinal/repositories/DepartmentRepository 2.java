package com.ironhack.repasofinal.repositories;

import com.ironhack.repasofinal.models.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

import java.util.*;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
