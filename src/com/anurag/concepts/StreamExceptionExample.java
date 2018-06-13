package com.anurag.concepts;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExceptionExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>(); 
		list.add("ank");
		list.add("sam");
		list.add("az");
		list.add("neh");
		list.add("ad");
		
		Stream stream =list.stream();
		stream.forEach(System.out::println);
		/*Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed
		at java.util.stream.AbstractPipeline.sourceStageSpliterator(AbstractPipeline.java:279)
		at java.util.stream.ReferencePipeline$Head.forEach(ReferencePipeline.java:580)
		at com.anurag.concepts.StreamExceptionExample.main(StreamExceptionExample.java:19)*/
		
		
		//Avoid above exception to create new stream if already operated
		//stream =list.stream()
		stream.forEach(System.out::println);
	}
}
