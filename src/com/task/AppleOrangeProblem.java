package com.task;

import java.util.Scanner;
/*
 * The input the program is linear and executed only once.
 * The least number of for loop is used. The number of fruits fallen on house is calculated 
 * as and when the distance is entered reducing the number of for loops. 
 * A single method is used to calculate the number of fruits fallen on home.     
 * 
 */
public class AppleOrangeProblem {

	public static void main(String[] args) {
		//Take in put		
		Scanner s = new Scanner(System.in);
		
		int start = s.nextInt(); //s
		int end = s.nextInt(); //t
		
		int loca = s.nextInt(); //a
		int locb = s.nextInt(); //b
		
		int sizea = s.nextInt(); //m - number of apples fell
		int sizeb = s.nextInt(); //n - number of oranges fell
		
		int noOfApples=0;
		int noOfOranges=0;
		
		System.out.println("Enter distance of apple from a");		
		for(int i=0;i<sizea;i++){			
			noOfApples = noOfApples + countApplesAndOranges(loca,s.nextInt(),start,end);
		}
			
		System.out.println("Enter distance of oranges from b");
		
		for(int i=0;i<sizeb;i++){
			noOfOranges = noOfOranges + countApplesAndOranges(locb,s.nextInt(),start,end);
		}
		
		System.out.println(noOfApples);
		System.out.println(noOfOranges);
	}

	private static int countApplesAndOranges(int location, int distance, int start,
			int end) {
		int distanceFromTree = location+distance;
		if(distanceFromTree >= start && distanceFromTree <= end){
			return 1;
		}
		return 0;
	}
}
