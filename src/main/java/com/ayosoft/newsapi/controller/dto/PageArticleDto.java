package com.ayosoft.newsapi.controller.dto;

import java.util.List;

public class PageArticleDto {
	private String status;
	private String totalResults;
	private List<ArticleDto> articles;

	public String getStatus() {
		return status;
	}

	public String getTotalResults() {
		return totalResults;
	}

	public List<ArticleDto> getArticles() {
		return articles;
	}
}
