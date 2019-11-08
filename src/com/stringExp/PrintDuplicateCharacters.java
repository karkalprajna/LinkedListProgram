package com.stringExp;

import java.util.HashMap;

public class PrintDuplicateCharacters {
	public static void main(String args[]){
		String name = "prajna karkal";
		System.out.println(checkDuplicateChar(name));
	}

	private static HashMap< Character, Integer> checkDuplicateChar(String name) {
		char[] names = name.toCharArray();
		HashMap< Character, Integer> duplicateList = new HashMap<Character, Integer>();
		for(Character chName : names){
			if(duplicateList.containsKey(chName)){
				duplicateList.put(chName,duplicateList.get(chName)+1);
			}else{
				duplicateList.put(chName,1);
			}
		}
		return duplicateList;
	}
}
