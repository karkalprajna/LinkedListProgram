package com.LinkedList.V1;

public class OddEven {
	public static void main(String args[]){
		int element[] = {10,50,60,12,30,99,33,23};
		int size= element.length;
		int odd[] = new int[size];
		int even[] = new int [size];
		int j = 0;
		int k = 0;
		
		for(int i=0 ; i < size ; i++){
			if(element[i] % 2 != 0){
				odd[j] = element[i];
				j++;
			}else{
				even[k] = element[i];
				k++;
			}
		}
		
		// print odd
		for (int i = 0; i < j - 1; i++) {
			System.out.println("odd elements :"+odd[i]);
		}
		// print even
		for (int i = 0; i < k - 1; i++) {
			System.out.println("even elements :"+even[i]);
		}

	}
}
