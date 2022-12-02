package com.ironhack.repasofinal.services;

import com.ironhack.repasofinal.dtos.*;
import com.ironhack.repasofinal.models.*;
import com.ironhack.repasofinal.repositories.*;
import com.ironhack.repasofinal.services.interfaces.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.stereotype.*;
import org.springframework.web.server.*;

import java.util.*;

@Service
public class ProductService implements ProductServiceInt {

    @Autowired
    ProductRepository productRepository;

    @Autowired
    DepartmentRepository departmentRepository;



    public Product addProduct(ProductDTO productDTO) {

        Department department = departmentRepository.findById(productDTO.getDepartmentId()).orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND, "El departamento no existe"));

        return productRepository.save(new Product(productDTO.getProductName(), productDTO.getQuantity(), department));

    }

    public Product decrementQuantity(Long productId, Integer quantity) {
        Product product = productRepository.findById(productId).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "El producto no existe"));

        if (quantity > product.getQuantity()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "El stock es insuficiente");
        }

        product.setQuantity(product.getQuantity() - quantity);

        return productRepository.save(product);
    }

    public Product findById(Long id) {
        return productRepository.findById(id).orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND, "Producto no encontrado"));
    }

    public void deleteById(Long id) {
        productRepository.deleteById(id);
    }
}
