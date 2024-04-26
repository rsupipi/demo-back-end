package com.example.demoservice.facade;

import com.example.demoservice.dto.CustomerDTO;

public interface CustomerFacade {
    CustomerDTO createUser(CustomerDTO customerDTO);

    CustomerDTO getUser(String email);

}
