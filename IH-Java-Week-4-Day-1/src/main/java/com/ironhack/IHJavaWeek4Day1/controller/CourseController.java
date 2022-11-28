package com.ironhack.IHJavaWeek4Day1.controller;

import com.ironhack.IHJavaWeek4Day1.models.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class CourseController {

    @GetMapping("/courses")
    @ResponseStatus(HttpStatus.OK)
    List<Course> getCourses() {
        List<Course> courses = new ArrayList<>();
        courses.add(new Course("CS101", "Intro to java"));
        courses.add(new Course("CS103", "Intro to Spring"));

        return courses;

    }

}
