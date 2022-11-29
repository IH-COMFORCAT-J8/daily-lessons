package com.ironhack.IHJavaWeek4Day1.repositories;

import com.ironhack.IHJavaWeek4Day1.models.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

@Repository
public interface StudentRepository extends JpaRepository<Student, String> {
}
