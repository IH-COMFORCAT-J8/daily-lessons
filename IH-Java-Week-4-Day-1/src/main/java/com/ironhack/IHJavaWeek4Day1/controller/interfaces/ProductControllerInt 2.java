package com.ironhack.IHJavaWeek4Day1.controller.interfaces;

import com.ironhack.IHJavaWeek4Day1.enums.*;
import com.ironhack.IHJavaWeek4Day1.models.*;

import java.util.*;

public interface ProductControllerInt {

    List<Product> findAllProducts();
    Product findProductById(Long id);
    List<Product> findProductsByDepartment(String department);
    List<Product> findByCategoryAndDepartment(Optional<String> category, Optional<String> department);

    Product addProduct(Product product);




}
