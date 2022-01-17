package com.omerozturk.thirdhomeworkomerozturk18.entities.dto;


public class CustomerDto {
    private String id;
    private String customerName;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;

    public CustomerDto() {
    }

    public CustomerDto(String id, String customerName, String firstName, String lastName, String email, String phone) {
        this.id = id;
        this.customerName = customerName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
