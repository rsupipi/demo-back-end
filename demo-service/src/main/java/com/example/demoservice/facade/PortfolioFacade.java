package com.example.demoservice.facade;

import com.example.demoservice.dto.CustomerDTO;
import com.example.demoservice.dto.PortfolioDTO;

public interface PortfolioFacade {

    /**
     * Get portfolio list
     * */
    PortfolioDTO getPortfolios();

}
