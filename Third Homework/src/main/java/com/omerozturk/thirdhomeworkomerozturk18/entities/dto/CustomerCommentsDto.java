package com.omerozturk.thirdhomeworkomerozturk18.entities.dto;


public class CustomerCommentsDto {
    private String customerId;
    private String customerFirstName;
    private String productName;
    private String comment;
    private String commentDate;

    public CustomerCommentsDto() {
    }

    public CustomerCommentsDto(String customerId, String customerFirstName, String productName, String comment, String commentDate) {
        this.customerId = customerId;
        this.customerFirstName = customerFirstName;
        this.productName = productName;
        this.comment = comment;
        this.commentDate = commentDate;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerFirstName() {
        return customerFirstName;
    }

    public void setCustomerFirstName(String customerFirstName) {
        this.customerFirstName = customerFirstName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(String commentDate) {
        this.commentDate = commentDate;
    }

    @Override
    public String toString() {
        return "CustomerCommentsDto{" +
                "customerId=" + customerId +
                ", customerFirstName='" + customerFirstName + '\'' +
                ", productName='" + productName + '\'' +
                ", comment='" + comment + '\'' +
                ", commentDate=" + commentDate +
                '}';
    }
}
