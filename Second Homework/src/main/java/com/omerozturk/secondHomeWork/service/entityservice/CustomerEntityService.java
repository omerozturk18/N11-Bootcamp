package com.omerozturk.secondHomeWork.service.entityservice;




import com.omerozturk.secondHomeWork.dao.CustomerDao;
import com.omerozturk.secondHomeWork.dto.CustomerCommentsDto;
import com.omerozturk.secondHomeWork.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerEntityService {

    @Autowired
    private CustomerDao customerDao;

    public List<Customer> findAll(){
        return customerDao.findAll();
    }

    public Customer findById(Long id){
        Optional<Customer> optionalCustomer = customerDao.findById(id);
        Customer customer = null;
        if (optionalCustomer.isPresent()){
            customer = optionalCustomer.get();
        }
        return customer;
    }
    public Customer save(Customer customer){
        return customerDao.save(customer);
    }
    public void delete(Customer customer){
        customerDao.delete(customer);
    }

    public void deleteById(Long id){
        customerDao.deleteById(id);
    }

    public List<CustomerCommentsDto> findAllCustomerComments(Long id){
       return customerDao.findAllCustomerComments(id);
    }
    public List<Customer> findAllByFirstName(String firstName){
        return customerDao.findAllByFirstNameContaining(firstName);
    }
    public Customer findAllByPhone(String phoneNumber){
        return customerDao.findAllByPhoneLike(phoneNumber);
    }
}
