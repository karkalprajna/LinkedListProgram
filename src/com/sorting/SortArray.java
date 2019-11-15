package com.sorting;


/*Sort an array without changing position of negative numbers*/
public class SortArray {
	public static void main(String args[]){
		int numbers[]={2, -6, -3, 8, 4, 1};
		
		int size = numbers.length;
		
		sortNumber(numbers,size);
		
	}

	private static void sortNumber(int[] numbers, int size) {
		int j=0;
		int newArray[] = new int[4];
		for(int i=0; i<size; i++){
			if(numbers[i]>=0){
				newArray[j++]=numbers[i];
			}
		}
		
		//sort new array
		for(int i=0; i<newArray.length; i++){
			for(int k=i+1; k<newArray.length; k++){
				if(newArray[i]>newArray[k]){
					int temp = newArray[i];
					newArray[i] = newArray[k];
					newArray[k] = temp;
				}
			}
		}
		int k=0;
		for(int i=0; i<size; i++){
			if(numbers[i]>=0){
				numbers[i] = newArray[k++];
			}
			System.out.println(numbers[i]);
		}
		
		
		
	}

}
