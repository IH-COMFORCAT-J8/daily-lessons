package com.ironhack.repasofinal.services;

import com.ironhack.repasofinal.dtos.*;
import com.ironhack.repasofinal.models.*;
import com.ironhack.repasofinal.repositories.*;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.context.*;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class ProductServiceTest {

    @Autowired
    ProductService productService;

    @Test
    void shouldAddNewProduct_WhenDTOisPassed() {
        ProductDTO productDTO = new ProductDTO("Martillo", 50, 1l);

        Product result = productService.addProduct(productDTO);

        assertTrue("Martillo".equals(result.getName()));

    }



}
