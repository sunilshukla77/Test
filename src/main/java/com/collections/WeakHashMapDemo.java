package com.collections;

import java.util.Map;
import java.util.WeakHashMap;

class Temp{
	public String toString(){
		return "temp";
	}
	protected void finalize(){
		System.out.println("finalize method");
	}
}

public class WeakHashMapDemo {
	public static void main(String[] args) throws Exception {
		//Map<Temp, String> m=new HashMap<Temp, String>();
		Map<Temp, String> m = new WeakHashMap<Temp, String>();
		Temp t = new Temp();
		m.put(t, "aspire");
		System.out.println(m);
		t = null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(m);
	}
}
