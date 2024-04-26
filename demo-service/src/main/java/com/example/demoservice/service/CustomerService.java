
package com.example.demoservice.service;

import com.example.demoservice.dto.CustomerDTO;
import com.example.demoservice.entity.Customer;

public interface CustomerService {
    Customer createUser(CustomerDTO customerDTO);

    Customer getUser(String email);

}