package com.ironhack.IHJavaWeek4Day1.controller;

import com.ironhack.IHJavaWeek4Day1.models.*;
import com.ironhack.IHJavaWeek4Day1.repositories.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import java.math.*;

@RestController
public class StudentController {
    @Autowired
    StudentRepository studentRepository;

    @PostMapping("/student")
    public Student addStudent(@RequestBody Student student) {
        return studentRepository.save(student);
    }


}
