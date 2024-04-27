package com.example.demoservice.facade.impl;

import com.example.demoservice.dto.CustomerDTO;
import com.example.demoservice.dto.PortfolioDTO;
import com.example.demoservice.entity.Customer;
import com.example.demoservice.entity.Portfolio;
import com.example.demoservice.facade.CustomerFacade;
import com.example.demoservice.facade.PortfolioFacade;
import com.example.demoservice.service.CustomerService;
import com.example.demoservice.service.PortfolioService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class PortfolioFacadeImpl implements PortfolioFacade {

    private final PortfolioService portfolioService;

    public PortfolioFacadeImpl(PortfolioService portfolioService) {
        this.portfolioService = portfolioService;
    }

    @Override
    public PortfolioDTO getPortfolios() {

        //todo getting the user id method should come here
        Long userId = 1L;

        log.info("Entering.. Class: {} , Method: getPortfolios(), User_Id: {}", this.getClass(), userId);
        Portfolio portfolio = portfolioService.getPortfolios(userId);
        PortfolioDTO portfolioDTO =  new PortfolioDTO();

        log.info("Exiting.. Class: {} , Method: getPortfolios(), User_Id: {}", this.getClass(), userId);
        return null;
    }
}