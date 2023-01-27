package com.ironhack.repasofinal.dtos;

import lombok.*;

@Data
@AllArgsConstructor
public class ProductDTO {
    private String productName;
    private Integer quantity;
    private Long departmentId;
}
