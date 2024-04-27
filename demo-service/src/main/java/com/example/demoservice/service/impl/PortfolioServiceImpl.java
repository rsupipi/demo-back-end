
package com.example.demoservice.service.impl;

import com.example.demoservice.entity.Portfolio;

import com.example.demoservice.repository.PortfolioRepository;
import com.example.demoservice.service.PortfolioService;
import org.springframework.stereotype.Service;

@Service
public class PortfolioServiceImpl implements PortfolioService {

    private final PortfolioRepository portfolioRepository;

    public PortfolioServiceImpl(PortfolioRepository portfolioRepository) {
        this.portfolioRepository = portfolioRepository;
    }

    @Override
    public Portfolio getPortfolios(Long customer_id) {
        return null;
    }

//    @Override
//    public Customer createUser(CustomerDTO customerDTO) {
//        //logs
//        // is existing validationc
//        Customer customer = new Customer();
//        BeanUtils.copyProperties(customerDTO, customer);
//        customer = customerRepository.save(customer);
//        return customer;
//    }
//
//    @Override
//    public Customer getUser(String email) {
//        Optional<Customer> optionalCustomer = customerRepository.findByEmail(email);
//        if (optionalCustomer.isPresent()) {
//            return optionalCustomer.get();
//        }else {
//            throw new DataNotFoundException();
//        }
//    }
}