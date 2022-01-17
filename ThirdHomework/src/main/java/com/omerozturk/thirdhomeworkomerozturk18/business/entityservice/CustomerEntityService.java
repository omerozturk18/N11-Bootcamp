package com.omerozturk.thirdhomeworkomerozturk18.business.entityservice;




import com.omerozturk.thirdhomeworkomerozturk18.dataAccess.repository.CustomerDao;
import com.omerozturk.thirdhomeworkomerozturk18.entities.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerEntityService {

    @Autowired
    private CustomerDao customerDao;

    public List<Customer> findAll(){
        return customerDao.findAll();
    }

    public Customer findById(String id){
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

    public void deleteById(String id){
        customerDao.deleteById(id);
    }

    public List<Customer> findAllByFirstName(String firstName){
        return customerDao.findAllByFirstNameContaining(firstName);
    }
    public Customer findAllByPhone(String phoneNumber){
        return customerDao.findAllByPhoneLike(phoneNumber);
    }
}
