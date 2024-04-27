
package com.example.demoservice.repository;

import com.example.demoservice.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PortfolioRepository extends JpaRepository<Customer, Long> {

}
