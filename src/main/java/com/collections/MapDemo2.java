package com.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

class Bank implements Comparable<Bank>{
	private String ifsc;
	private String name;
	public Bank(String ifsc, String name) {
		super();
		this.ifsc = ifsc;
		this.name = name;
	}
	
	@Override
	public int compareTo(Bank b){
		String str1 = this.ifsc;
		String str2 = b.ifsc;
		return str1.compareTo(str2);
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ifsc == null) ? 0 : ifsc.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bank other = (Bank) obj;
		if (ifsc == null) {
			if (other.ifsc != null)
				return false;
		} else if (!ifsc.equals(other.ifsc))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Bank [ifsc=" + ifsc + ", name=" + name + "]";
	}
	
	
}

public class MapDemo2 {
	public static void main(String[] args) {
		//Map<Bank, String> map = new Hashtable<Bank, String>();
		Map<Bank, String> map = new HashMap<Bank, String>();
		//Map<Bank, String> map = new TreeMap<Bank, String>();
		
		Bank b1 = new Bank("ICIC01", "ICICI Bank");
		Bank b2 = new Bank("SBI01", "SBI Bank");
		Bank b3 = new Bank("SBI01", "SBI Bank"); //duplicate
		
		map.put(b1, "Ameerpet");
		map.put(b2, "SR Nagar");
		map.put(b3, "KPHB");
		
		System.out.println(map.size());
		
		Iterator<Bank> itKeyMap = map.keySet().iterator();
		while(itKeyMap.hasNext()) {
			System.out.println(itKeyMap.next().toString());
		}
		
	//	Iterator<String> itValMap = map.values().iterator();
		for (Iterator iterator = map.values().iterator(); iterator.hasNext();) {
			System.out.println(iterator.next());
			
		}
	
	}
}
