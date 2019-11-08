package com.stringExp;

public class UsingCompareTo {
	public static void main(String args[]){
		String firstName = "prajna Karkal";
		
		findLengthOfString(firstName);
	}

	private static void findLengthOfString(String firstName) {
		String findLength = "";
		System.out.println("Length of string :"+firstName.compareTo(findLength));
	}
}
