package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaStreams {
	
	public static void main(String args[]){
		 //1. Integer Stream
		IntStream
			.range(1,10)
			.forEach(System.out::print);
		
		System.out.println("---------------");
		
		//2. Integer Stream with skip
		IntStream
		.range(1,10)
		.skip(6)
		.forEach(x->System.out.println(x));
		System.out.println("---------------");
		
		//3. Integer Stream with sum
		System.out.println(
				IntStream.range(1, 5).sum());
		
		System.out.println("---------------");
		
		//4.Stream.of . sorted and findFirst
		Stream.of("karkal","Prajna","likitha")
		.sorted()
		.findFirst()
		.ifPresent(x->System.out.println(x));
		
		System.out.println("---------------");
		
		//5. Stream of array, sort, filter 
		String name[] = {"karkal","Prajna","likitha","Namratha"};
		Arrays.stream(name)
		.filter(x-> x.startsWith("l"))
		.sorted()
		.forEach(System.out::print);
		
		System.out.println("---------------");
		
		//8. find the maximum number using method reference 
		List<Integer> numberList = Arrays.asList(89,4,40,234,90);
		Optional<Integer> max = numberList.stream().reduce(Math::max);
		max.ifPresent(value -> System.out.println(value));
		
		System.out.println("---------------");
		
	}

}
