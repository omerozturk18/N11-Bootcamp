package dto;

import java.util.Date;

public class CustomerCommentsDto {
    private Long customerId;
    private String customerFirstName;
    private String productName;
    private String comment;
    private Date commentDate;

    public CustomerCommentsDto() {
    }

    public CustomerCommentsDto(Long customerId, String customerFirstName, String productName, String comment, Date commentDate) {
        this.customerId = customerId;
        this.customerFirstName = customerFirstName;
        this.productName = productName;
        this.comment = comment;
        this.commentDate = commentDate;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
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

    public Date getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(Date commentDate) {
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
