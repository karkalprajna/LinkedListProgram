package com.task;

import java.util.Scanner;
/*
 * Only one for loop is used.
 * 
 * */
public class CountingValleysProblem {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//Enter the input steps
		int steps = s.nextInt();
		
		//Enter the char string
		Scanner s1 = new Scanner(System.in);
		String upAndDown = s1.nextLine();
		int seaLeavel = 0;
		int up = 0;
		int down = 0;
		int valley = 0;
		
		if(steps != upAndDown.length() ){
			System.out.println("Enter complete steps");
		}
		
		
		for(int i=0; i< upAndDown.length();i++){
			if(seaLeavel == 0){
				if(upAndDown.charAt(i) == 'U'){
					seaLeavel = 1;
				}else if (upAndDown.charAt(i) == 'D'){
					seaLeavel = -1;
				}
			}
			if(upAndDown.charAt(i) == 'U'){
				up++;				
			}
			
			if (upAndDown.charAt(i) == 'D'){
				down++;
			}
			if(up == down){
				if(seaLeavel == -1){ valley++; } 
				seaLeavel = 0;
			}
		}
		System.out.println(valley);
	}

}
