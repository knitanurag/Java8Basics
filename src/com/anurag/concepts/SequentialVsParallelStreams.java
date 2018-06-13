package com.anurag.concepts;

import java.util.ArrayList;
import java.util.List;

public class SequentialVsParallelStreams {
	public static void main(String[] args) {
		long startNanoSec = 0;
		long endNanoSec = 0;
		int maxElements = 9992999;
		
		List<Integer> numberArr = new ArrayList<Integer>();
		for(int i = 0;i<maxElements;i++){
			numberArr.add(i);
		}
		startNanoSec = System.nanoTime();
		numberArr.stream().count();
		endNanoSec = System.nanoTime();
		System.out.println(" Time taken to count : "+(endNanoSec-startNanoSec));
		
		
		startNanoSec = System.nanoTime();
		numberArr.parallelStream().count();
		endNanoSec = System.nanoTime();
		System.out.println(" Time taken to count : "+(endNanoSec-startNanoSec));
		
	}
	
	
	
}
