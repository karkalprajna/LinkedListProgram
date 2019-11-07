package com.sorting;

public class SegregateZeroAndOnes {
	public static void main(String args[]) {
		int arrayEle[] = { 0, 1, 1, 0, 1, 0, 1, 0, 0 };
		int count = 0;
		for (int i = 0; i < arrayEle.length; i++) {
			if (arrayEle[i] == 0) {
				count++;
			}
		}
		for (int i = 0; i < count; i++) {
			arrayEle[i] = 0;
		}
		for (int i = count; i < arrayEle.length; i++) {
			arrayEle[i] = 1;
		}
		
		for (int i = 0; i < arrayEle.length; i++) {
			System.out.println(arrayEle[i]);
		}
	}
}
