package com.example.spring_rest.mappers;

import com.example.spring_rest.entities.Customer;
import com.example.spring_rest.model.CustomerDTO;
import org.mapstruct.Mapper;

/**
 * Created by jt, Spring Framework Guru.
 */
@Mapper
public interface CustomerMapper {

    Customer customerDtoToCustomer(CustomerDTO dto);

    CustomerDTO customerToCustomerDto(Customer customer);

}