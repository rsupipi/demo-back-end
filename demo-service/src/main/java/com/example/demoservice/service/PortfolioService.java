
package com.example.demoservice.service;

import com.example.demoservice.entity.Portfolio;

/**
 * Service for handle portfolios
 * @author Ruchira
 */
public interface PortfolioService {

    /**
     * Get Portfolios
     * @param customerId
     * @return portfolio list
     */
    Portfolio getPortfolios(Long customerId);

}