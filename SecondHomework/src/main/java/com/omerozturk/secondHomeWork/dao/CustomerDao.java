package com.omerozturk.secondHomeWork.dao;

import com.omerozturk.secondHomeWork.dto.CustomerCommentsDto;
import com.omerozturk.secondHomeWork.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerDao extends JpaRepository<Customer, Long> {
    @Query(" select " +
            " new com.omerozturk.secondHomeWork.dto.CustomerCommentsDto( customer.id, customer.firstName,product.productName,productComment.comment,productComment.commentDate ) " +
            " from Customer customer " +
            "left join ProductComment productComment  on  customer.id = productComment.customer.id " +
            "left join Product product  on  productComment.product.id =product.id " +
            " where customer.id = :customerId ")
    List<CustomerCommentsDto> findAllCustomerComments(Long customerId);
    List<Customer> findAllByFirstNameContaining(String firstName);
    Customer findAllByPhoneLike(String phoneNumber);
}
