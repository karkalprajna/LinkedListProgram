package com.task;

import java.util.Scanner;
/*
 * Only one for loop is used. Each solution is found as soon as the input is consumed.
 * Which reduces the using on another for loop.
 * Minimal variables are declared.
 * */
public class CatAndMouseProblem {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//Enter the query
		int q = s.nextInt();
		
		//Enter the position of catA catB and mouseC
		for(int i=1; i<=q ; i++){
			int catA = s.nextInt();
			int catB = s.nextInt();
			int mouseC = s.nextInt();
			catAndMouse(catA,catB,mouseC);
		}

	}

	private static void catAndMouse(int catA, int catB, int mouseC) {
		int dist1 = Math.abs(mouseC - catA);
		int dist2 = Math.abs(mouseC - catB);
		if(dist1 == dist2){
			System.out.println("mouseC");
		}else if(dist1 < dist2){
			System.out.println("catA");
		}else {
			System.out.println("catB");
		}		
	}

}
