package com.LinkedList.V1;

import java.util.Scanner;

public class InsertAtTheMiddleOfArray {
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of elemets in the array");
		int n = s.nextInt();
		
		System.out.println("Enter the elemets in the array");
		
		int element[] = new int[n+1];
		
		for(int i=0 ; i<n ;i++){
			element[i] = s.nextInt();
		}
		
		System.out.println("Enter the position of the array");
		int pos = s.nextInt();
		
		System.out.println("Enter the element of the array");
		int newElement = s.nextInt();
		
		for(int i = n-1; i>= (pos - 1) ; i-- ){
			element[i+1] = element[i];
		}
		element[pos] = newElement;
		
		//print the elements 
		
	}
}
