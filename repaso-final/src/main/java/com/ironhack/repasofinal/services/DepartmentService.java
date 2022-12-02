package com.ironhack.repasofinal.services;

import com.ironhack.repasofinal.models.*;
import com.ironhack.repasofinal.repositories.*;
import com.ironhack.repasofinal.services.interfaces.*;
import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.stereotype.*;
import org.springframework.web.server.*;

import java.util.*;

@Service
public class DepartmentService implements DepartmentServiceInt {
    @Autowired
    DepartmentRepository departmentRepository;

    @Autowired
    ProductRepository productRepository;

    public List<Product> findByDepartmentId(Optional<Long> id) {

        if (!id.isPresent()) {
            return productRepository.findAll();
        }

        Department department =departmentRepository.findById(id.get()).orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND, "Departamento no encontrado"));

        return department.getProducts();
    }
}
