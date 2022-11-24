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


    //Podemos utilizar argumentos posicionales ?1 para el primer arg, ?2 para el segundo...
    //Podemos utilizar argumentos nominales con el uso de :nombreDelArgumento
    @Query("SELECT g.sectionId, AVG (g.score) from Grade g group by g.sectionId having count(g) > :numStudents order by g.sectionId")
    List<Object[]> findAverageBySectionHavingMoreThan(Long numStudents);

    @Query(value = "select section_id, avg(score) from grade group by section_id having count(*) > :numStudents order by section_id;", nativeQuery = true)
    List<Object[]> findAverageBySectionHavingMoreThanV2(Long numStudents);


    /*
    position 0: [Objeto: CS101-A, Objecto: 91.0],
    position 1: [Objeto: CS101-B, Objecto: 86.0],
    position 2: [Objeto: CS103-A, Objecto: 76.0]

     */

}
