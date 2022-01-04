package com.omerozturk.thirdhomeworkomerozturk18.entities.dto;

import java.math.BigDecimal;
import java.util.Date;

public class ProductCommentDto {
    private String id;
    private String comment;
    private Date commentDate;
    private String productId;
    private String customerId;

    public ProductCommentDto() {
    }

    public ProductCommentDto(String id, String comment, Date commentDate, String productId, String customerId) {
        this.id = id;
        this.comment = comment;
        this.commentDate = commentDate;
        this.productId = productId;
        this.customerId = customerId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(Date commentDate) {
        this.commentDate = commentDate;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
}
