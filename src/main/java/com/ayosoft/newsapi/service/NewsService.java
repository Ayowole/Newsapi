package com.ayosoft.newsapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ayosoft.newsapi.controller.dto.PageArticleDto;
import com.ayosoft.newsapi.utils.NewsUtils;

@Service
public class NewsService {
	@Autowired
	private RestTemplate restTemplate;
	@Autowired
	private NewsUtils newsUtils;
	
	public PageArticleDto retrieveTopHeadlines(String query) {
		var fullUrl = newsUtils.getUrl().concat(newsUtils.getEndpointTopheadLine()).concat(query).concat("&apiKey=").concat(newsUtils.getKey());
		return restTemplate.getForObject(fullUrl, PageArticleDto.class);
	}
	
	
}
