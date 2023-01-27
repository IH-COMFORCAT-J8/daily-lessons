package com.ironhack.repasofinal.services.interfaces;


import com.ironhack.repasofinal.dtos.*;
import com.ironhack.repasofinal.models.*;

public interface ProductServiceInt {
    Product addProduct(ProductDTO product);
    Product decrementQuantity(Long productId, Integer quantity);
    Product findById(Long id);
    void deleteById(Long id);

}
