package com.ironhack.IHJavaWeek1Day4;

import com.ironhack.IHJavaWeek1Day4.models.*;
import com.ironhack.IHJavaWeek1Day4.models.embedded.*;
import com.ironhack.IHJavaWeek1Day4.repository.*;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.context.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class StudentTest {

    @Autowired
    StudentRepository studentRepository;

    @Test
    void shouldCreateNewStudent_WhenSaved() {

        Address address = new Address("C/Pepito, 28", 29600, "Barcelona", "Spain");
        Address physicalAddress = new Address("C/Fulanito, 23", 40400, "Madrid","Spain");


        studentRepository.save(new Student("Raul", "Ruiz", address, physicalAddress));

        assertEquals(1, studentRepository.findAll().size());


    }
}
