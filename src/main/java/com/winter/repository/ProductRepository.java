package com.winter.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.winter.model.Product;


public interface ProductRepository extends JpaRepository<Product, Integer>{

	List<Product> findByKeywordId(int keywordId);

}