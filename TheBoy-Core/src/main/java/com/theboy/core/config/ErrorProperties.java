package com.theboy.core.config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("apz.core")
public class ErrorProperties {
	
	private final Map<String, String> error = new HashMap<String, String>();
	
	@Bean
	public Map<String, String> populateErrorVal(){
		return error;
	}

}
