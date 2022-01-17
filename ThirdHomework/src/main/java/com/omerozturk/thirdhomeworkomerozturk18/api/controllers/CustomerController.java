package com.omerozturk.thirdhomeworkomerozturk18.api.controllers;

import com.omerozturk.thirdhomeworkomerozturk18.business.converter.CustomerConverter;
import com.omerozturk.thirdhomeworkomerozturk18.entities.dto.CustomerDeleteDto;
import com.omerozturk.thirdhomeworkomerozturk18.entities.dto.CustomerDto;
import com.omerozturk.thirdhomeworkomerozturk18.entities.entity.Customer;
import com.omerozturk.thirdhomeworkomerozturk18.business.entityservice.CustomerEntityService;
import com.omerozturk.thirdhomeworkomerozturk18.business.exception.CustomerNotFoundException;
import com.omerozturk.thirdhomeworkomerozturk18.business.exception.CustomerNotMatchException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {
    @Autowired
    private CustomerEntityService customerEntityService;

    @GetMapping("")
    public List<CustomerDto> findAll(){

        List<Customer> customerList = customerEntityService.findAll();

        List<CustomerDto> customerDtoList = CustomerConverter.INSTANCE.convertAllCustomerListToCustomerDtoList(customerList);

        return customerDtoList;
    }

    @GetMapping("/{id}")
    public Customer findById(@PathVariable String id){

        Customer customer = customerEntityService.findById(id);

        return customer;
    }

    @PostMapping("")
    public CustomerDto save(@RequestBody CustomerDto customerDto){
        Customer customer = CustomerConverter.INSTANCE.convertCustomerDtoToCustomer(customerDto);
        customer = customerEntityService.save(customer);
        CustomerDto customerDtoResult = CustomerConverter.INSTANCE.convertCustomerToCustomerDto(customer);
        return customerDtoResult;
    }

    @PutMapping("")
    public CustomerDto update(@RequestBody CustomerDto customerDto){
        Customer customer = CustomerConverter.INSTANCE.convertCustomerDtoToCustomer(customerDto);
        customer = customerEntityService.save(customer);
        CustomerDto customerDtoResult = CustomerConverter.INSTANCE.convertCustomerToCustomerDto(customer);
        return customerDtoResult;
    }

    @DeleteMapping("")
    public void delete(@RequestBody CustomerDeleteDto customerDeleteDto){
        Customer customer=customerEntityService.findById(customerDeleteDto.getId());
        if (customer == null) throw new CustomerNotFoundException("Customer not found. id: " + customerDeleteDto.getId());
        if(!customer.getPhone().equals(customerDeleteDto.getPhone()))  throw new CustomerNotMatchException("Customer not match. phone: " + customerDeleteDto.getPhone());
        if(!customer.getCustomerName().equals(customerDeleteDto.getCustomerName())) throw new CustomerNotMatchException("Customer not match. CustomerName: " + customerDeleteDto.getCustomerName());

        customerEntityService.deleteById(customer.getId());
    }

    @GetMapping("/firstName/{firstName}")
    public List<CustomerDto> findAllByFirstName(@PathVariable String firstName){
        List<Customer> customers = customerEntityService.findAllByFirstName(firstName);
        List<CustomerDto> customerDtoList = CustomerConverter.INSTANCE.convertAllCustomerListToCustomerDtoList(customers);

        return customerDtoList;
    }
    @GetMapping("/phoneNumber/{phoneNumber}")
    public CustomerDto findAllByPhone(@PathVariable String phoneNumber){
        Customer customer = customerEntityService.findAllByPhone(phoneNumber);
        CustomerDto customerDto = CustomerConverter.INSTANCE.convertCustomerToCustomerDto(customer);
        return customerDto;
    }
}
