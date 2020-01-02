package com.stream;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaStreamsPractice {

	public static void main(String[] args) {
		//1. Integer Stream
		IntStream.range(1, 10).forEach(x->System.out.println(x));
		
		//2. Integer Stream with skip
		IntStream.range(1, 10).skip(4).forEach(x->System.out.println(x));
		System.out.println("------------------------");
		//3. Integer Stream with sum
		System.out.println(IntStream.range(1, 10).sum());
		//4.Stream.of . sorted and findFirst
		Stream.of(12,2,3,4,5,6,7,8,99,10)
		.sorted()
		.findFirst()
		.ifPresent(consumer->System.out.println(consumer));

	}

}
