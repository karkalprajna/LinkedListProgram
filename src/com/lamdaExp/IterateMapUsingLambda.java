package com.lamdaExp;

import java.util.ArrayList;
import java.util.List;

public class IterateMapUsingLambda {
	public static void main(String args[]){
		List<String> names = new ArrayList<>();
		names.add("prajna");
		names.add("karkal");
		names.add("likitha");
		
		printListOfNames(names);
		printListOfNamesInterface(names);
	}

	private static void printListOfNamesInterface(List<String> names) {
		FunctionalInterface funInt = ()->{
			for(String name : names){
				System.out.println(name);
			}
			System.out.println("list of names");
		};
		funInt.sayNames();
	}

	private static void printListOfNames(List<String> names) {
		names.forEach(name->System.out.println(name));
		
		
	}
	private interface FunctionalInterface{
		void sayNames();		
	}
	
}
