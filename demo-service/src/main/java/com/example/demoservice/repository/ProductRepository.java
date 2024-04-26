package com.example.demoservice.repository;

import com.example.demoservice.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

    Product findByName(String productName);
}
