package com.winter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.winter.model.Product;
import com.winter.repository.ProductRepository;
import com.winter.util.CrawNaverBlog;

@Controller
public class CrawNaverController {
	
	@Autowired
	private ProductRepository productRepository;
	
	@GetMapping("/craw/naver")
	public String crawNaver() {
		return "craw_naver";
	}
	
	@PostMapping("/craw/naver/proc")
	public @ResponseBody String crawNaverProc(String keyword) {
		System.out.println(keyword);
		
		List<Product> products = new CrawNaverBlog().startAllCraw(keyword);
		productRepository.saveAll(products);
		
		return "성공";
	}
}
