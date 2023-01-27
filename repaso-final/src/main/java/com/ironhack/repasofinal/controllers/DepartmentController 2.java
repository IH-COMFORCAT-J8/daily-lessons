package com.ironhack.repasofinal.controllers;

import com.ironhack.repasofinal.models.*;
import com.ironhack.repasofinal.services.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/departments")
public class DepartmentController {
    @Autowired
    DepartmentService departmentService;

    @GetMapping("/products")
    @ResponseStatus(HttpStatus.OK)
    private List<Product> findByDepartment(@RequestParam Optional<Long> departmentId) {
        return departmentService.findByDepartmentId(departmentId);
    }

}
