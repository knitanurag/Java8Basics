package com.anurag.concepts;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ReduceListExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>(); 
		list.add("ank");
		list.add("sam");
		list.add("az");
		list.add("neh");
		list.add("ad");
		
	Optional<String> optional =	list.stream().sorted().reduce((s1,s2)->s1+","+s2);
		System.out.println(optional.isPresent());
		System.out.println(optional.get());
		
	}
}
