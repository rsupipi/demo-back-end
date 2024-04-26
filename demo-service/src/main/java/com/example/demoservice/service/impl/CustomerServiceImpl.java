
package com.example.demoservice.service.impl;

import com.example.demoservice.dto.CustomerDTO;
import com.example.demoservice.entity.Customer;
import com.example.demoservice.exception.DataNotFoundException;
import com.example.demoservice.repository.CustomerRepository;
import com.example.demoservice.service.CustomerService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer createUser(CustomerDTO customerDTO) {
        //logs
        // is existing validationc
        Customer customer = new Customer();
        BeanUtils.copyProperties(customerDTO, customer);
        customer = customerRepository.save(customer);
        return customer;
    }

    @Override
    public Customer getUser(String email) {
        Optional<Customer> optionalCustomer = customerRepository.findByEmail(email);
        if (optionalCustomer.isPresent()) {
            return optionalCustomer.get();
        }else {
            throw new DataNotFoundException();
        }
    }
}