package com.ironhack.IHJavaWeek4Day1.controller;

import com.ironhack.IHJavaWeek4Day1.models.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class CourseController {

    //Tipo de petición y endpoint
    //GET, POST, PUT, PATCH
    //Endpoint = Ruta Relativa
    @GetMapping("/courses")
    //Código de respuesta en caso de que se haya procesado con éxito la petición
    @ResponseStatus(HttpStatus.OK)
    List<Course> getCourses() {

        return null;

    }

}
