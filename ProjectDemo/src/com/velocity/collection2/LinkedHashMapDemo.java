package com.velocity.collection2;

import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("101", "Pune");
		map.put("102", "Banglore");
		map.put("103", "Delhi");
		
		Set<String> set = map.keySet();
		
		for (String str : set) {
			System.out.println(str);
			System.out.println(map.get(str));
		}

	}

}
