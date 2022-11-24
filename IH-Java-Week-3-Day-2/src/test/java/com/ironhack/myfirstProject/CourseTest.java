package com.ironhack.myfirstProject;

import com.ironhack.myfirstProject.models.*;
import com.ironhack.myfirstProject.repositories.*;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.context.*;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class CourseTest {

    @Autowired
    CourseRepository courseRepository;
    Course course;
    Course course2;
    Course course3;
    @Autowired
    StudentRepository studentRepository;

    Student student;


    @BeforeEach
    void setUp() {
        student = studentRepository.save(new Student("Roberto", "Vetere"));
        student.getId();

        course = new Course("CS101", "Introduction to Spring");
        courseRepository.save(course);
        course2 = new Course("CS103", "Java Structures");
        course3 = new Course("CS104", "Java Advanced");
        // Guarda el objecto en la base de datos
        courseRepository.save(course2);
        courseRepository.save(course3);
    }

    @AfterEach
    void tearUp() {
        //Borra todos los objetos de la base de datos
        courseRepository.deleteAll();
    }

    @Test
    void ShouldFindCourses_WhenNameOfCourseIsGiven() {
        //Quiero encontrar todos los cursos cuyo nombre empiece por Java
        // Select * from course where course_name like "Java%"
        List<Course> courses = courseRepository.findByCourseNameStartingWith("Java");
        assertEquals(2, courses.size());
        assertEquals("Java Structures", courses.get(0).getCourseName());

    }

    @Test
    void ShouldStoreCourse_WhenNewCourseIsAdded() {
        List<Course> courses = courseRepository.findAll();

        assertEquals(1, courseRepository.findAll().size());
        // Course c1 = courseRepository.findById("CS101").get();
        assertTrue(courseRepository.findById("CS101").isPresent());

        /*
        Optional<Course> c1 = courseRepository.findById("CS101");
        Ejemplo de futuro caso de uso en la app, no en test
        if (c1.isPresent()) {
            course1 = c1.get();
        } else {
            throw new IllegalArgumentException();
        }
         */

    }


}
