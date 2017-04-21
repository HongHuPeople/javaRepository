package com.axis.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class BasePropertiesUtil {
	private static Properties properties = new Properties();
	static {
		InputStream in = BasePropertiesUtil.class.getResourceAsStream("/base.properties");
		try {
			properties.load(in); 
		} catch (IOException e) {
			
		}
	}
    public static String get(String key) {  
    	return properties.getProperty(key).trim();
    }  
}
