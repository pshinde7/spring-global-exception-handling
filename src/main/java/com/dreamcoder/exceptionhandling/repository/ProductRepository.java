package com.dreamcoder.exceptionhandling.repository;

import com.dreamcoder.exceptionhandling.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
