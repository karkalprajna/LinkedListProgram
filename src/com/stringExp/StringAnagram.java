package com.stringExp;

public class StringAnagram {
	public static void main(String args[]){
		String string1 = "army";
		String string2 = "mary";
		System.out.println("String Anagram :"+checkStringAnagram(string1,string2));
	}

	private static String checkStringAnagram(String string1, String string2) {
		String stringAnagram = "no";
		if(string1.compareTo(string2)!=0 && string1.length() == string2.length()){
			char[] string1chr = string1.toCharArray();
			for(Character ch : string1chr){
				//stringAnagram = (string2.indexOf(ch)>=0)? "yes" : "no";
				if(string2.indexOf(ch)>=0){
					stringAnagram = "yes";
				}else{
					stringAnagram = "no";
				}
			}			
		}else{
			System.out.println("Invalide string as input");
		}
		return stringAnagram;
	}
}
