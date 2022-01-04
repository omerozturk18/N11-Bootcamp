package com.omerozturk.secondHomeWork.dto;

import java.math.BigDecimal;
import java.util.Date;

public class ProductCommentDto {
    private Long id;
    private String comment;
    private Date commentDate;
    private Long productId;
    private Long customerId;

    public ProductCommentDto() {
    }

    public ProductCommentDto(Long id, String comment, Date commentDate, Long productId, Long customerId) {
        this.id = id;
        this.comment = comment;
        this.commentDate = commentDate;
        this.productId = productId;
        this.customerId = customerId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }
}
