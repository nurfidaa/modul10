package com.example.demo.controller;

import com.example.demo.entity.product;
import com.example.demo.model.response;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class ProductController {
    @Autowired
    private ProductService productService; // Dependency Injection
    @GetMapping(
            path = "/api/products",
            consumes = MediaType.ALL_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public response<List<product>> getAllProductsHandler() {
        var products = productService.getAllProduct();
        return response.<List<product>>builder().data(products).build();
    }
}
