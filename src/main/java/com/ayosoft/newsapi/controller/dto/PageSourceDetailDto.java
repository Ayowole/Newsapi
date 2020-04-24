package com.ayosoft.newsapi.controller.dto;

import java.util.List;

public class PageSourceDetailDto {
	private String status;
	private List<SourceDetailDto> sources;

	public String getStatus() {
		return status;
	}

	public List<SourceDetailDto> getSources() {
		return sources;
	}
}
