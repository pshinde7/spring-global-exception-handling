package com.dreamcoder.exceptionhandling.service.impl;

import com.dreamcoder.exceptionhandling.entity.Product;
import com.dreamcoder.exceptionhandling.exception.InvalidProductId;
import com.dreamcoder.exceptionhandling.repository.ProductRepository;
import com.dreamcoder.exceptionhandling.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    /**
     * @param productId
     * @return
     */
    @Override
    public Product getProduct(long productId) {

        try {
            Optional<Product> product = productRepository.findById(productId);
            if (product.isPresent()) {
                return product.get();
            }
            throw new InvalidProductId("Invalid Product Id....");
        } catch (Exception exception) {
            throw new InvalidProductId(exception.getMessage());
        }

    }
}
