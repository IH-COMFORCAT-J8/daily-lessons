package com.ironhack.IHJavaWeek1Day4.repository;

import com.ironhack.IHJavaWeek1Day4.models.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

@Repository
public interface AssignmentRepository extends JpaRepository<FinalAssignment, Long> {
}
