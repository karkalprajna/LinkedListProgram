package com.stringExp;

import java.util.Hashtable;

public class PrintUniqueCharacter {
	public static void main(String args[]){
		String name = "prajnakarkal";
		System.out.println(checkUniqueCharacter(name));
	}

	private static String checkUniqueCharacter(String name) {
		Hashtable<Character, Integer> charList = new Hashtable<Character, Integer>();
		char[] nameChar = name.toCharArray();
		String uniqueChar = new String();
		try {
			for (Character ch : nameChar) {
				if (charList.containsKey(ch)) {
					charList.put(ch, charList.get(ch) + 1);
				} else {
					charList.put(ch, 1);
				}
			}
			System.out.println(charList+" : ");
			for (Character ch : nameChar) {
				if (charList.get(ch) == 1) {
					uniqueChar = uniqueChar + ch;
				}
			}
		} catch (NullPointerException npe) {
			throw npe;
		}
		return uniqueChar;
	}
}
