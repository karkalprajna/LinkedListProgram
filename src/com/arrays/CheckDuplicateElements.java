package com.arrays;

import java.util.HashSet;


public class CheckDuplicateElements {

	public static void main(String[] args) {
		String[] withDuplicates = new String[] {"one","two","three","one","three"};
		checkDuplicate(withDuplicates);
	}

	private static void checkDuplicate(String[] withDuplicates) {
		HashSet<String> arrayDup = new HashSet<>();
		
		for(String str : withDuplicates ){
			if(!arrayDup.add(str)){
				System.out.println("contain duplicate element :" + str);
			}
		}
	}

}
