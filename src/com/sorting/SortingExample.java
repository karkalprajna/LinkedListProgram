package com.sorting;

import java.util.Scanner;

public class SortingExample {
	public static void main(String args[]) {
		int elements[] = {10,50,20,30,70,12,15,04};
		
		sortInAccending(elements);
		sortInDecending(elements);
		
		//Sort names in Alphabetical order 
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of names you want to enter");
		int n = s.nextInt();
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter your name");
		String name[] = new String[n];
		for(int i=0;i<n;i++){
			name[i]=s1.nextLine();
		}
		sortNameInAlphabetical(name);
		
	}

	private static void sortNameInAlphabetical(String name[]) {
		for(int i=0;i<name.length;i++){
			for(int j=i+1;j<name.length;j++){
				if(name[i].compareTo(name[j])>0){
					String temp = name[i];
					name[i] = name[j];
					name[j] = temp;
				}
			}
		}
		for(int i=0;i<name.length;i++){
			System.out.println(name[i]);
		}
	}

	private static void sortInDecending(int[] elements) {
		int size = elements.length;
		for(int i=0;i<size;i++){
			for(int j=i+1;j<size;j++){
				if(elements[i]<elements[j]){
					int temp = elements[i];
					elements[i] = elements[j];
					elements[j] = temp;
				}
			}
		}
		print("Decending Order",elements);
	}

	private static void sortInAccending(int[] elements) {
		int size = elements.length;
		for(int i=0;i<size;i++){
			for(int j=i+1;j<size;j++){
				if(elements[i]>elements[j]){
					int temp = elements[i];
					elements[i] = elements[j];
					elements[j] = temp;
				}
			}
		}
		print("Accending Order",elements);
		
	}

	private static void print(String discription, int[] elements) {
		for(int i=0;i<elements.length;i++){
			System.out.println(discription + elements[i]);
		}
		
	}
}
