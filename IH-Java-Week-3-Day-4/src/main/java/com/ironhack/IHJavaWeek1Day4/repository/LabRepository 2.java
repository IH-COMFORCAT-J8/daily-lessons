package com.ironhack.IHJavaWeek1Day4.repository;

import com.ironhack.IHJavaWeek1Day4.models.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

import java.util.*;

@Repository
public interface LabRepository extends JpaRepository<Lab, Long> {
    List<Lab> findByStudent(Student student);
}
