package com.stringExp;

import java.util.LinkedHashSet;

public class StringExamples {

	public static void main(String[] args) {
		String str1 = "prajna";
		String str2 = "karkal";
		removeDuplicateChar(str1,str2);
		
		String str3 = "xyz";
		String str4 = "zyx";
		rotationStrings(str3,str4);

	}

	private static void rotationStrings(String str3, String str4) {
		// check if two strings are rotations of each other
		// both must be of same length
		if (str3.length() == str4.length()) {
			StringBuilder strBuilder = new StringBuilder();
			strBuilder.append(str3);
			String reverse = strBuilder.reverse().toString();
			if (str4.equals(reverse)) {
				System.out.println(str3 + " is reverse of " + str4);
			} else {
				System.out.println(str3 + " is not reverse of " + str4);
			}
		} else {
			System.out.println("Invalid input strings");
		}
	}

	private static void removeDuplicateChar(String str1, String str2) {
		//remove characters from the first String which are present in the second String
		char[] charArray1 = str1.toCharArray();

		LinkedHashSet<Character> outputchar = new LinkedHashSet<>();
		for(int i=0;i<charArray1.length;i++){
			//if charArray1[i] contains in charArray2 den ignore else add it to outputchar
			if(str2.indexOf(charArray1[i]) == -1){
				outputchar.add(charArray1[i]);
			}
		}
		System.out.println("List of charectors:" + outputchar.toString());
	} 

}
