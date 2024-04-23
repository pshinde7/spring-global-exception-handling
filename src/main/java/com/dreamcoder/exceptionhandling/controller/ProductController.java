package com.dreamcoder.exceptionhandling.controller;


import com.dreamcoder.exceptionhandling.entity.Product;
import com.dreamcoder.exceptionhandling.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products/{productId}")
    public Product getProduct(@PathVariable long productId){
        return productService.getProduct(productId);
    }
}
