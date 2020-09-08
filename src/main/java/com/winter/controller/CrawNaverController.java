package com.winter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CrawNaverController {
	
	@GetMapping("/craw/naver")
	public String crawNaver() {
		return "craw_naver";
	}
}
