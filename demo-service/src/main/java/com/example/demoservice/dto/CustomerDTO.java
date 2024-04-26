package com.example.demoservice.dto;

import com.example.demoservice.entity.Address;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerDTO {

    private Long id;

    private String userName;

    private String email;

    private AddressDTO address;
}
