package com.collections;

import java.util.IdentityHashMap;
import java.util.Map;

class IdentityHashMapDemo {
	public static void main(String[] args) {
		//Map<Integer, String> m = new HashMap<Integer, String>();
		Map<Integer, String> m = new IdentityHashMap<Integer, String>();
		Integer I1 = new Integer(10);
		Integer I2 = new Integer(11);
		m.put(I1, "aspire");
		m.put(I2, "technologies");
		System.out.println(m);
		
		System.out.println(I1.equals(I2));
		
		System.out.println(I1==I2);
		
		Integer I3 = I1;
		System.out.println(I3.equals(I1));
		System.out.println(I3==I1);
	}
}
