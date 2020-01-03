package com.task;
/*
 * The time complexity of if statement is O(n).
 * The least number of for loop is used. The time complexity of for loop is directly proportional to N.
 * Minimal variables are declared.  
 * */
public class MiniMaxSum {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		miniMaxSum(arr);
	}

	private static void miniMaxSum(int[] arr) {
		int minSum = 0;
        int maxSum = 0;        
        int sum = 0;
        int[] tempSum = new int[arr.length];
                
        //find the sum of array
        for(int k=0;k<arr.length;k++){
             sum += arr[k];
        }
        
        //array containing the sum of 4 numbers
        for(int k=0;k<arr.length;k++){
        	tempSum[k]=(sum - arr[k]);  
        	if(k==0){
        		minSum = maxSum = tempSum[k];
        	}
        	if(tempSum[k]>maxSum){
                maxSum = tempSum[k];
            }
            if(tempSum[k]<minSum){
                minSum = tempSum[k];
            }
       }
        
        System.out.println(minSum +" "+maxSum);
	}
}
