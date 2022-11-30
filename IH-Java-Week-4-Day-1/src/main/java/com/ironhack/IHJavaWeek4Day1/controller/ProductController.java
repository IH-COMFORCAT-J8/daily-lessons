package com.ironhack.IHJavaWeek4Day1.controller;

import com.ironhack.IHJavaWeek4Day1.controller.interfaces.*;
import com.ironhack.IHJavaWeek4Day1.dtos.*;
import com.ironhack.IHJavaWeek4Day1.enums.*;
import com.ironhack.IHJavaWeek4Day1.models.*;
import com.ironhack.IHJavaWeek4Day1.repositories.*;
import com.ironhack.IHJavaWeek4Day1.services.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.math.*;
import java.util.*;

@RestController
@RequestMapping("/products")
public class ProductController implements ProductControllerInt {

    @Autowired
    ProductService productService;

    @PostMapping("/add-seller")
    @ResponseStatus(HttpStatus.CREATED)
    public Seller addNewSeller(@RequestBody Seller seller) {
        return productService.addSeller(seller);
    }

    @PatchMapping("/update-seller")
    public Product updateSeller(@RequestBody UpdateSellerDTO updateSellerDTO) {
        return productService.updateSeller(updateSellerDTO);
    }


    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    public List<Product> findAllProducts() {
        return productService.findAllProducts();
    }

    @GetMapping("/all/price-only")
    @ResponseStatus(HttpStatus.OK)
    public List<NameAndPriceDTO> findAllProductsNameAndPrice() {
        return productService.findALlNameAndPrice();
    }

    // localhost:8080/products/id/?id=
    // localhost:8080/products/id/1

    @GetMapping("/id/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Product findProductById(@PathVariable Long id) {

       return productService.findProductById(id);
    }

    // localhost:8081/department?department=Clo
    @GetMapping("/department")
    public List<Product> findProductsByDepartment(@RequestParam String department) {
        return productService.findProductsByDepartment(department);
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

        return productService.findByCategoryAndDepartment(category, department);
    }

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public Product addProduct(@RequestBody Product product) {
        return productService.addProduct(product);
    }

    @PutMapping("/id/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Product updateProduct(@PathVariable Long id, @RequestBody Product product) {
        return productService.update(id, product);
    }

    @PatchMapping("/id/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Product updatePrice(@PathVariable Long id, @RequestParam BigDecimal price) {
        return productService.updatePrice(id, price);
    }
}
