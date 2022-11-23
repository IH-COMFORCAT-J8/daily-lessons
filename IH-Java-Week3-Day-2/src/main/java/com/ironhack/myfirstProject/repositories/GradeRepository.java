package com.ironhack.myfirstProject.repositories;

import com.ironhack.myfirstProject.models.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

import java.util.*;

@Repository
public interface GradeRepository extends JpaRepository<Grade, Integer> {
    List<Grade> findByStudentNameStartingWith(String name);

    // select section_id, avg(score) from grade group by section_id order by section_id;
    @Query("SELECT sectionId, AVG(score) from Grade GROUP BY sectionId order by sectionId")
    List<Object[]> findAverageBySection();

    /*
    position 0: [Objeto: CS101-A, Objecto: 91.0],
    position 1: [Objeto: CS101-B, Objecto: 86.0],
    position 2: [Objeto: CS103-A, Objecto: 76.0]

     */

}
