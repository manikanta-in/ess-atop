package com.mbusa.atop.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

}
