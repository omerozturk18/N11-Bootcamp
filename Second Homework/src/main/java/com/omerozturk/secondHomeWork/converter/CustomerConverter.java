package com.omerozturk.secondHomeWork.converter;

import com.omerozturk.secondHomeWork.dto.CustomerDto;
import com.omerozturk.secondHomeWork.entity.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CustomerConverter {
    CustomerConverter INSTANCE = Mappers.getMapper(CustomerConverter.class);

    @Mapping(source = "id", target = "id")
    Customer convertCustomerDtoToCustomer(CustomerDto productDto);

    @Mapping(source = "id", target = "id")
    CustomerDto convertCustomerToCustomerDto(Customer customer);

    @Mapping(source = "id", target = "id")
    List<CustomerDto> convertAllCustomerListToCustomerDtoList(List<Customer> customerList);

}
