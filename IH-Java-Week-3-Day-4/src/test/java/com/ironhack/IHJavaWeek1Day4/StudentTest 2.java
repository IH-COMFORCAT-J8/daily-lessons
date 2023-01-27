package com.ironhack.IHJavaWeek1Day4;

import com.ironhack.IHJavaWeek1Day4.models.*;
import com.ironhack.IHJavaWeek1Day4.models.embedded.*;
import com.ironhack.IHJavaWeek1Day4.repository.*;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.context.*;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class StudentTest {

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    AssignmentRepository assignmentRepository;

    @Autowired
    LabRepository labRepository;

    Student student;
    FinalAssignment finalAssignment;

    List<Lab> labs;

    @BeforeEach
    void setUp() {
        Address address = new Address("C/Pepito, 28", 29600, "Barcelona", "Spain");
        Address physicalAddress = new Address("C/Fulanito, 23", 40400, "Madrid", "Spain");
        student = studentRepository.save(new Student("Raul", "Ruiz", address, physicalAddress));

        finalAssignment = assignmentRepository.save(new FinalAssignment("Introducción a Java", 90, student));

        student.setAssignment(finalAssignment);

        studentRepository.save(student);

        labs = labRepository.saveAll(List.of(
                new Lab("Intro to java", 9, student),
                new Lab("Intro to databases", 8, student),
                new Lab("Jpa Relationships", 10, student)
        ));

        student.setLabs(labs);

        studentRepository.save(student);


    }

    @AfterEach
    void tearDown() {
        labRepository.deleteAll();
        assignmentRepository.deleteAll();
        studentRepository.deleteAll();
    }

    @Test
    void shouldCreateNewStudent_WhenSaved() {

        assertEquals(1, studentRepository.findAll().size());

    }

    @Test
    void shouldCreateNewAssignment_WhenSaved() {
        FinalAssignment finalAssignment1 = assignmentRepository.findAll().get(0);
        Student student1 = studentRepository.findAll().get(0);

        assertEquals("Raul", finalAssignment1.getStudent().getFirstName());
        assertEquals("Introducción a Java", student1.getAssignment().getName());
    }

    @Test
    void shouldAssignLabsToStudent_WhenCreated() {
        Student student1 = studentRepository.findAll().get(0);
        assertEquals(3, student1.getLabs().size());
    }



}
