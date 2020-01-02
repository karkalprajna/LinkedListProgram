package com.arrays;

public class SmallestLargestArray {

	public static void main(String[] args) {
		int[] numbers = {12,3,4,15,-12,16,12};
		findLargestsmallest(numbers);

	}

	private static void findLargestsmallest(int[] numbers) {
		int smallest=numbers[0];
		int largest=numbers[0];
		
		for(int i=1; i<numbers.length;i++){			
			if(numbers[i]>largest){
				largest = numbers[i];
			}
			if(numbers[i]<smallest){
				smallest = numbers[i];
			}
		}
		
		System.out.println("Largest : "+largest);
		System.out.println("smallest : "+smallest);
	}

}
