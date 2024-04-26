package com.example.demoservice.facade.impl;

import com.example.demoservice.dto.CustomerDTO;
import com.example.demoservice.entity.Customer;
import com.example.demoservice.facade.CustomerFacade;
import com.example.demoservice.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class CustomerFacadeImpl implements CustomerFacade {

    private final CustomerService customerService;

    public CustomerFacadeImpl(CustomerService customerService) {
        this.customerService = customerService;
    }

    @Override
    public CustomerDTO createUser(CustomerDTO customerDTO) {
        // logs
        Customer customer = customerService.createUser(customerDTO);
        CustomerDTO customerResponse = new CustomerDTO();
        BeanUtils.copyProperties(customer, customerResponse);
        return customerResponse;
    }

    @Override
    public CustomerDTO getUser(String email) {

        log.info("Entering.. Class: {} , Method: getUser(), email: {}", this.getClass(), email);

        Customer customer = customerService.getUser(email);
        CustomerDTO customerResponse = new CustomerDTO();
        BeanUtils.copyProperties(customer, customerResponse);
        return customerResponse;

    }
}