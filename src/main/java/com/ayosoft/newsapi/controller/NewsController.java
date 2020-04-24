package com.ayosoft.newsapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ayosoft.newsapi.controller.dto.PageArticleDto;
import com.ayosoft.newsapi.service.NewsService;

@RestController
public class NewsController {
	@Autowired
	private NewsService newsService;
	
	@GetMapping("/top-headlines")
	public PageArticleDto search(@RequestParam(defaultValue = "br") String country) {
		return newsService.retrieveTopHeadlines("?".concat("country=").concat(country));
	}
	
}