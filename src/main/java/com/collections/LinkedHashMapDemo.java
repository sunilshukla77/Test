package com.collections;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {

	public LinkedHashMapDemo() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		LinkedHashMap ht = new LinkedHashMap();
		ht.put("driverClassName", "oracle.jdbc.driver.OracleDriver");
		ht.put("url", "jdbc:oracle:thin:@localhost:1521:xe");
		ht.put("username", "system");
		ht.put("password", "manager");
		ht.put(null, null);
		System.out.println(ht.toString());
	}
}
