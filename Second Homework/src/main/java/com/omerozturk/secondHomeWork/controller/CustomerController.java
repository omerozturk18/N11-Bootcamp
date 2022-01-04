package com.omerozturk.secondHomeWork.controller;

import com.omerozturk.secondHomeWork.converter.CustomerConverter;
import com.omerozturk.secondHomeWork.dto.CustomerCommentsDto;
import com.omerozturk.secondHomeWork.dto.CustomerDeleteDto;
import com.omerozturk.secondHomeWork.dto.CustomerDto;
import com.omerozturk.secondHomeWork.entity.Customer;
import com.omerozturk.secondHomeWork.exception.CustomerNotFoundException;
import com.omerozturk.secondHomeWork.exception.CustomerNotMatchException;
import com.omerozturk.secondHomeWork.service.entityservice.CustomerEntityService;
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
    public Customer findById(@PathVariable Long id){

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

    @GetMapping("/customerComments/{customerId}")
    public List<CustomerCommentsDto> findAllCustomerComments(@PathVariable Long customerId){
        List<CustomerCommentsDto> customerCommentsDtoList = customerEntityService.findAllCustomerComments(customerId);
        return customerCommentsDtoList;
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
