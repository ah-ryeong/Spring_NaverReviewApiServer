package com.winter.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.winter.review.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}