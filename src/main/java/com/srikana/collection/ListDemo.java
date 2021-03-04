package com.srikana.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ListDemo {

	public ListDemo() {
	}
	
	public static void main(String args[]) {
		String[] ary= {"Srikana","Amit","Pradeep","Bhakti","Pradeep","Amit","Pooja","Ram"};
		List<String> stringl= Arrays.asList(ary);
		
		System.out.println("\n\t\tString Array **** "+"\n");
		for (int i = 0; i < ary.length; i++) {
			
			System.out.print(ary[i]+" ");
		}
		
		List<String> al= new ArrayList();
		al.addAll(stringl);
		al.add("Sunil");
		//al.add(456);
		//Collections.sort(al);
		System.out.println("\n\t\t******ArrayList ****"+"\n");
		for (Iterator iterator = al.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			System.out.print(object+" ");
		}
		
		Set<String> hs= new HashSet<String>();
		Collections.synchronizedSet(hs);
		hs.addAll(stringl);
		System.out.println("\n\t\t****HashSet*****"+"\n");
		for (String string : hs) {
			System.out.print(string+" ");
		}
		
		Set<String> ts= new TreeSet<String>();
		ts.addAll(stringl);
		System.out.println("\n\t\t*****TreeSet******* \n");
		for (String string : ts) {
			System.out.print(string+" ");
		}
		
		Set<String> ls= new LinkedHashSet<String>();
		ls.addAll(stringl);
		ls.add(null);
		ls.add(null);
		
		System.out.println("\n\t\t*******LinkedHashSet ********\n");
		for (String string : ls) {
			System.out.print(string+" ");
		}
		
	}

}
