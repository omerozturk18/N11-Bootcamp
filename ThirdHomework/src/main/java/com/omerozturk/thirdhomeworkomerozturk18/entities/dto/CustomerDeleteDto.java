package com.omerozturk.thirdhomeworkomerozturk18.entities.dto;

public class CustomerDeleteDto {
    private String id;
    private String customerName;
    private String phone;

    public CustomerDeleteDto() {
    }

    public CustomerDeleteDto(String id, String customerName, String phone) {
        this.id = id;
        this.customerName = customerName;
        this.phone = phone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
