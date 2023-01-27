package com.ironhack.IHJavaWeek4Day1.dtos;

public class UpdateSellerDTO {
    private Long productId;
    private Long newSellerId;

    public UpdateSellerDTO(Long productId, Long newSellerId) {
        this.productId = productId;
        this.newSellerId = newSellerId;
    }

    public UpdateSellerDTO() {
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getNewSellerId() {
        return newSellerId;
    }

    public void setNewSellerId(Long newSellerId) {
        this.newSellerId = newSellerId;
    }
}
