package com.arrays;

import java.util.HashSet;


public class FindIntegerPareEqlSum {

	public static void main(String[] args) {
		int[] numbers = {12,4,6,8,3,6,2};
		int sum = 12;
		
		integerPairFind(numbers,sum);

	}

	private static void integerPairFind(int[] numbers, int sum) {
		if(numbers.length < 2){
			return;
		}
		HashSet<Integer> set = new HashSet<>();
		
		for(int value : numbers){
			int target = sum - value;
			
			if(!set.contains(target)){
				set.add(value);
			}else{
				System.out.println("("+value+","+target+") = "+sum);
			}
		}
		
	}
	/*
	public static void printPairsUsingTwoPointers(int[] numbers, int k) {
		if (numbers.length < 2) {
			return;
		}
		Arrays.sort(numbers);
		int left = 0;
		int right = numbers.length - 1;
		while (left < right) {
			int sum = numbers[left] + numbers[right];
			if (sum == k) {
				System.out.printf("(%d, %d) %n", numbers[left], numbers[right]);
				left = left + 1;
				right = right - 1;
			} else if (sum < k) {
				left = left + 1;
			} else if (sum > k) {
				right = right - 1;
			}
		}
	}
*/
}
