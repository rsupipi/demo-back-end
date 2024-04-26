package com.example.demoservice.controller;

import com.example.demoservice.dto.CustomerDTO;
import com.example.demoservice.facade.CustomerFacade;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

//Swagger Configs
@RestController
@RequestMapping("/customer")
public class CustomerController {

    private final CustomerFacade customerFacade;

    public CustomerController(CustomerFacade customerFacade) {
        this.customerFacade = customerFacade;
    }

    @GetMapping("/{email}")
    public ResponseEntity<CustomerDTO> getCustomerByEmail(@PathVariable String email){

        return new ResponseEntity<CustomerDTO>(customerFacade.getUser(email), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<CustomerDTO> createCustomer(@RequestBody(required = true) CustomerDTO customer) {
        return new ResponseEntity<CustomerDTO>(customerFacade.createUser(customer), HttpStatus.OK);
    }
}
