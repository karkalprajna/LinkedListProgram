package com.LinkedList.V1;

public class secoundLargestElement {
	public static void main(String args[]){
		int element[] = {10,50,60,12,30};
		
		for(int i=0; i < element.length ; i++){
			for(int j = i+1; j< element.length ; j++){
				if(element[i] > element[j]){
					int flag = element[i];
					element[i] = element[j];
					element[j] = flag;
				}
			}
		}
		System.out.println ("length" + element.length);
		System.out.println ("smallest element "+element[0]);
		System.out.println ("secound largest" + element[element.length -1]);
	}

}
