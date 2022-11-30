package com.ironhack.IHJavaWeek4Day1.services;

import com.ironhack.IHJavaWeek4Day1.controller.interfaces.*;
import com.ironhack.IHJavaWeek4Day1.enums.*;
import com.ironhack.IHJavaWeek4Day1.models.*;
import com.ironhack.IHJavaWeek4Day1.repositories.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import java.math.*;
import java.util.*;

@Service
public class ProductService {

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

    public Product update(Long id, Product product) {
        //Recibimos el id por url y el producto por json
        //Si el id existe en la base de datos, asignamos el id al producto que hemos recibido y lo guardamos en la base de datos
        if (productRepository.findById(id).isPresent()) {
            product.setId(id);
            return productRepository.save(product);
        }

        return null;
    }

    public Product updatePrice(Long id, BigDecimal price) {
        Product product = productRepository.findById(id).get();
        product.setPrice(price);
        return productRepository.save(product);
    }

    public void delete(Long id) {
        productRepository.deleteById(id);
    }
}
