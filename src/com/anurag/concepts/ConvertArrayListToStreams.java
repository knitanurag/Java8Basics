package com.anurag.concepts;

import java.util.ArrayList;
import java.util.List;

public class ConvertArrayListToStreams {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>(); 
		list.add("ank");
		list.add("sam");
		list.add("az");
		list.add("neh");
		list.add("ad");
		System.out.println(list);
		System.out.println("_____________________Starts with a_____________________________");
		list.stream().filter((s)->s.startsWith("a")).forEach(System.out::println);
		System.out.println("_____________________Sorted Ascending__________________________");
		list.stream().filter((s)->s.startsWith("a")).sorted().forEach(System.out::println);
		System.out.println("_____________________Sorted Descending__________________________");
		list.stream().filter((s)->s.startsWith("a")).sorted((a,b)->b.compareTo(a)).forEach(System.out::println);
		System.out.println("_____________________Any Record starts with a__________________________");
		list.stream().anyMatch((s)->s.startsWith("a"));
		System.out.println(list.stream().anyMatch((s)->s.startsWith("a")));
		System.out.println("_____________________Count Records Starts with a_____________________________");
		list.stream().filter((s)->s.startsWith("a")).count();
		System.out.println(list.stream().filter((s)->s.startsWith("a")).count());
	}
}
