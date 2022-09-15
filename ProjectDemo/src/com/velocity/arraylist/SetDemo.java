package com.velocity.arraylist;

import java.util.HashSet;
import java.util.Iterator;

public class SetDemo {

	public static void main(String[] args) {
		HashSet<Integer> st = new HashSet<Integer>();
		st.add(11);
		st.add(22);
		
		for (Integer integer : st) {
			System.out.println(st);
		}
	}

}
