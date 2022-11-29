package com.ironhack.IHJavaWeek4Day1.services;

import com.ironhack.IHJavaWeek4Day1.controller.interfaces.*;
import com.ironhack.IHJavaWeek4Day1.enums.*;
import com.ironhack.IHJavaWeek4Day1.models.*;
import com.ironhack.IHJavaWeek4Day1.repositories.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import java.util.*;

@Service
public class ProductService  {

    @Autowired
    ProductRepository productRepository;


    public List<Product> findAllProducts() {
        return productRepository.findAll();
    }

    public Product findProductById(Long id) {
        return productRepository.findById(id).get();

    }

    public List<Product> findProductsByDepartment(String department) {
        return productRepository.findByDepartment(Department.valueOf(department.toUpperCase()));
    }

    public List<Product> findByCategoryAndDepartment(Optional<String> category, Optional<String> department) {
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

    public Product addProduct(Product product) {

        return productRepository.save(product);
    }
}
