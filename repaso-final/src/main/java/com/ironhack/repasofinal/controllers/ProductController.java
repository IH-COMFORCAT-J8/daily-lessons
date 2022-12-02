package com.ironhack.repasofinal.controllers;

import com.ironhack.repasofinal.dtos.*;
import com.ironhack.repasofinal.models.*;
import com.ironhack.repasofinal.services.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.OK)
    private Product addProduct(@RequestBody ProductDTO productDTO) {
        return productService.addProduct(productDTO);
    }

    @PatchMapping("/{id}")
    private Product updatePrice(@PathVariable Long id, @RequestParam Integer quantity) {
        return productService.decrementQuantity(id, quantity);

    }

}
