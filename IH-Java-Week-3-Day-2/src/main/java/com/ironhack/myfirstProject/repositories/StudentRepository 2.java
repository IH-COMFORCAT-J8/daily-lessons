package com.ironhack.myfirstProject.repositories;

import com.ironhack.myfirstProject.models.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

import java.util.*;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {


}
