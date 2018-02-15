package com.poc.loans.bbgtrades.api;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class TradeProcessContext {

	public static Map<String, Object> contextMap = new ConcurrentHashMap<String, Object>();
	
	public static void set(String key, Object value) {
		contextMap.put(key,  value);
	}
	
	public static Object get(String key)  {
		return contextMap.get(key);
	}
}
