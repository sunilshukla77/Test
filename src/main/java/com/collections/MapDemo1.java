package com.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo1 {
	public static void main(String[] args) {
		//Map<String, String> map = new Hashtable<String, String>();
		//Map<String, String> map = new HashMap<String, String>();
		Map<String, String> map = new TreeMap<String, String>();
		
		map.put("driverClassName", "oracle.jdbc.driver.OracleDriver");
		map.put("url", "jdbc:oracle:thin:@localhost:1521:xe");
		map.put("username", "system");
		map.put("password", "manager");
		map.put("password", "aspire123");
		//map.put(null, null);
		//System.out.println(map.toString());
		
		//Read keys
		Iterator<String> keys = map.keySet().iterator();
		while(keys.hasNext()){
			String key = keys.next();
			System.out.print(key+" ");
		}
		System.out.println();
		
		//Read values
		Iterator<String> values = map.values().iterator();
		while(values.hasNext()){
			String value = values.next();
			System.out.print(value+" ");
		}
	}
}
