package com.theboy.core.config;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import com.theboy.core.utils.CommonUtils;

@Configuration
public class AppConfiguration {
	
	
	private static final Logger logger = Logger.getLogger(AppConfiguration.class);
	
	@Autowired
	private CommonProperties commonProperties;
	
	@Autowired
	private ErrorProperties errorProperties;
	
	@Autowired
	private Environment environment;
	
	public void runAtStartUp() {
		
		CommonUtils.initilizeLog4j(environment.getProperty("apz.log4jfile.url"));
		CommonUtils.initilizeCommonProperties(commonProperties.populateCommon());
		CommonUtils.initilizeErrorCodeMap(errorProperties.populateErrorVal());
		
		if(logger.isInfoEnabled()) {
			logger.info("Core Is Booting....");
		}
	}
	
	
	

}
