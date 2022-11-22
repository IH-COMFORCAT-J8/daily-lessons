package com.ironhack.myfirstProject.repositories;

import com.ironhack.myfirstProject.models.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

import java.util.*;

@Repository
public interface CourseRepository extends JpaRepository<Course, String> {
    List<Course> findByCourseNameStartingWith(String name);

}
