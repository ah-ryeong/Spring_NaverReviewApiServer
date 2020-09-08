package com.winter.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.winter.review.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

	void saveAll(List<com.winter.model.Product> products);

}