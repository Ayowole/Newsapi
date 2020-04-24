package com.ayosoft.newsapi.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class NewsUtils {
	@Value("${newsapi.url}")
	private String url;
	@Value("${newsapi.key}")
	private String key;
	@Value("${newsapi.endpoints.topheadlines}")
	private String endpointTopheadLine;
	@Value("${newsapi.endpoints.everithing}")
	private String endpointEverithing;
	@Value("${newsapi.endpoints.sources}")
	private String endpointSorces;

	public String getUrl() {
		return url;
	}

	public String getKey() {
		return key;
	}

	public String getEndpointTopheadLine() {
		return endpointTopheadLine;
	}

	public String getEndpointEverithing() {
		return endpointEverithing;
	}

	public String getEndpointSorces() {
		return endpointSorces;
	}

}
