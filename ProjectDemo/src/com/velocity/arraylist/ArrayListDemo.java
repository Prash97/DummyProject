package com.velocity.arraylist;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Prashant","Sammy","Pankaj","Ram");
		
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			String string = (String) itr.next();
			System.out.println(string);
		}
	
	}
}
