package com.omerozturk.secondHomeWork.dto;

public class CustomerDeleteDto {
    private Long id;
    private String customerName;
    private String phone;

    public CustomerDeleteDto() {
    }

    public CustomerDeleteDto(Long id, String customerName, String phone) {
        this.id = id;
        this.customerName = customerName;
        this.phone = phone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
