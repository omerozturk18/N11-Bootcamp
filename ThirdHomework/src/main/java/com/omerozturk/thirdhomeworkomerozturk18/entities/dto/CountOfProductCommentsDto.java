package com.omerozturk.thirdhomeworkomerozturk18.entities.dto;

import java.math.BigDecimal;

public class CountOfProductCommentsDto {

    private String productId;
    private String productName;
    private BigDecimal price;
    private Long commentCount;

    public CountOfProductCommentsDto() {
    }

    public CountOfProductCommentsDto(String productId, String productName, BigDecimal price, Long commentCount) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.commentCount = commentCount;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Long getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Long commentCount) {
        this.commentCount = commentCount;
    }

    @Override
    public String toString() {
        return "CountOfProductCommentsDto{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", commentCount=" + commentCount +
                '}';
    }
}
