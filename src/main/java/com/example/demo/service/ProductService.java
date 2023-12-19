package com.example.demo.service;

import org.apache.catalina.User;
import com.example.demo.entity.product;
import com.example.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository; // Dependency Injection
    public List<product> getAllProduct() {
        return productRepository.findAll();
    }
}

