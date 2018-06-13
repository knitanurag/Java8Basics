package com.anurag.concepts;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Java8ForEachExample {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		oldWayToIterate(list);
		java8WayUsingInnerClass(list);
		java8WayUsingConsumerInterfaceImplementation(list);
		
		
	}

	private static void java8WayUsingConsumerInterfaceImplementation(List<Integer> list) {
		list.forEach(new MyConsumer());
		
	}

	private static void java8WayUsingInnerClass(List<Integer> list) {
		list.forEach(new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.println(t);
			}
		});
	}

	private static void oldWayToIterate(List<Integer> list) {
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext()){
			Integer i = itr.next();
			System.out.println(i);
		}
	}
}

class MyConsumer implements Consumer<Integer>{

	@Override
	public void accept(Integer t) {
		System.out.println(t);
		
	}
	
}
