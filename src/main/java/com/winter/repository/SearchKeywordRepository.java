package com.winter.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.winter.model.SearchKeyword;

public interface SearchKeywordRepository extends JpaRepository<SearchKeyword, Integer>{

	SearchKeyword findByKeyword(String keyword);
}