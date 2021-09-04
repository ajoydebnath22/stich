package com.theboy.core.utils;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class CommonUtils {
	
	private static final Logger logger = Logger.getLogger(CommonUtils.class);
	
	protected static Map<String, String> commonProperties = null;
	
	protected static Map<String, String> errorCodeMap = null;
	
	private CommonUtils() {
	}
	
	public static String getErrorCodeDescription(String errrorKey) {
		return  errorCodeMap.get(errrorKey);
	}
	
	public static String getCommonProperties(String commonKey) {
		return commonProperties.get(commonKey);
	}

	
	public static void initilizeCommonProperties(Map<String, String> commonValues) {
		commonProperties = commonValues;
	}
	
	public static void initilizeLog4j(String log4jPropertyUrlPath) {
		URL loggerPropUrl = null;
		try{
			loggerPropUrl = new URL(log4jPropertyUrlPath);
		}catch (MalformedURLException e) {
			// Can not log any thing
		}
		PropertyConfigurator.configure(loggerPropUrl);
		
		if(logger.isDebugEnabled()) {
			logger.debug("Log4j is being read from "+log4jPropertyUrlPath);
		}
		
	}
	
	public static void initilizeErrorCodeMap(Map<String, String> errorCodeMaps) {
		errorCodeMap = errorCodeMaps;
	}

}
