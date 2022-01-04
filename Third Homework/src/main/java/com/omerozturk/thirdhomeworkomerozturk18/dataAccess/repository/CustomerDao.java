package com.omerozturk.thirdhomeworkomerozturk18.dataAccess.repository;

import com.omerozturk.thirdhomeworkomerozturk18.entities.entity.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CustomerDao extends MongoRepository<Customer, String> {
    List<Customer> findAllByFirstNameContaining(String firstName);
    Customer findAllByPhoneLike(String phoneNumber);
}
