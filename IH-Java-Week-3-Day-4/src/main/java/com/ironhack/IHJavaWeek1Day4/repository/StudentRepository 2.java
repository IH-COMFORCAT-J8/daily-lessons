package com.ironhack.IHJavaWeek1Day4.repository;

import com.ironhack.IHJavaWeek1Day4.models.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

import javax.persistence.*;
import java.util.*;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
