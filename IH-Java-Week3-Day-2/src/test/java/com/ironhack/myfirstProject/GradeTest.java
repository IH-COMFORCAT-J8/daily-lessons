package com.ironhack.myfirstProject;

import com.ironhack.myfirstProject.models.*;
import com.ironhack.myfirstProject.repositories.*;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.context.*;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class GradeTest {

    @Autowired
    GradeRepository gradeRepository;
    Grade grade;

    List<Grade> grades;

    @BeforeEach
    void setUp() {
        grade = gradeRepository.save(new Grade("Raul", "CS101-B", 91));
        grades = gradeRepository.saveAll(List.of(
                new Grade("Maya Charlotte", "CS101-A", 98),
                new Grade("James Fields", "CS101-A", 82),
                new Grade("Michael Alcocer", "CS101-B", 65),
                new Grade("Maya Charlotte", "CS103-A", 89),
                new Grade("Tomas Lacroix", "CS101-A", 99),
                new Grade("Sara Bisat", "CS101-A", 87),
                new Grade("James Fields", "CS101-B", 46),
                new Grade("Helena Sepulvida", "CS103-A", 72)
        ));

    }

    @AfterEach
    void tearDown() {
        gradeRepository.deleteAll();
    }

    @Test
    void shouldStoreNewUser_WhenMethodSaveCalled() {
        assertEquals(9, gradeRepository.findAll().size());
    }

    @Test
    void shouldReturnAverageGradeBySection_WhenMethodIsCalled() {
        List<Object[]> averageBySection = gradeRepository.findAverageBySection();

        assertEquals(3, averageBySection.size());

        String firstSection = (String) averageBySection.get(0)[0];

        assertEquals("CS101-A", firstSection);

        Double averageLastSection = (Double) averageBySection.get(2)[1];

        assertEquals(80.5, averageLastSection);


    }

}
