package com.theboy.core.config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("apz.core")
public class CommonProperties {

	private final Map<String, String> common = new HashMap<>();
	
	@Bean
	public Map<String, String> populateCommon(){
		return common;
	}
	
	
}
