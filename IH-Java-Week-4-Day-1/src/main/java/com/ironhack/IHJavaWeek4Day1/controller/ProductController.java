package com.ironhack.IHJavaWeek4Day1.controller;

import com.ironhack.IHJavaWeek4Day1.controller.interfaces.*;
import com.ironhack.IHJavaWeek4Day1.enums.*;
import com.ironhack.IHJavaWeek4Day1.models.*;
import com.ironhack.IHJavaWeek4Day1.repositories.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/products")
public class ProductController implements ProductControllerInt {

    @Autowired
    ProductRepository productRepository;


    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    public List<Product> findAllProducts() {
        return productRepository.findAll();
    }

    // localhost:8080/products/id/?id=
    // localhost:8080/products/id/1

    @GetMapping("/id/{id}")
    public Product findProductById(@PathVariable Long id) {
        return productRepository.findById(id).get();
    }

    // localhost:8081/department?department=Clo
    @GetMapping("/department")
    public List<Product> findProductsByDepartment(@RequestParam String department) {
        return productRepository.findByDepartment(Department.valueOf(department.toUpperCase()));
    }

    /*
    Todos sean opcionales

    - Si me pasan categoria y departamento: filtro por categoria y departamento
    - Si me pasan solo categoría: filtro por categoría
    - Si me pasan solo departamento: filtro por departamento
    - Si no me pasan nada: devuelvo todos los productos

    Optional: Pueden estar presentes o no, nos los pueden mandar o no
    localhost:8080/products/filter?category=NEW&department=ELECTRONICS
     */
    @GetMapping("/filter")
    @ResponseStatus(HttpStatus.OK)
    public List<Product> findByCategoryAndDepartment(@RequestParam Optional<String> category, @RequestParam Optional<String> department) {
        if (category.isPresent() && department.isPresent()) {
            return productRepository.findByCategoryAndDepartment(Category.valueOf(category.get().toUpperCase()), Department.valueOf(department.get().toUpperCase()));
        }

        if (category.isPresent()) {
            return productRepository.findByCategory(Category.valueOf(category.get().toUpperCase()));
        }

        if (department.isPresent()) {
            return productRepository.findByDepartment(Department.valueOf(department.get().toUpperCase()));

        }

        return productRepository.findAll();
    }
}
