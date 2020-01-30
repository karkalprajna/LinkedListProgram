package practicePrograms;
/*A unsorted array of integers is given; you need to find the max product 
 * formed my multiplying three numbers. 
 * (You cannot sort the array, watch out when there are negative numbers)*/
public class FindMaxProd {

	public static void main(String[] args) {
		int[] array = {1,40,12,25,-4};
		int n = array.length;
		
		System.out.println(findMaxProd(array,n));

	}

	private static int findMaxProd(int[] arr, int n) {
		// if size is less than 3, no triplet exists 
	    if (n < 3) 
	        return -1; 
	  
	    // Initialize Maximum, second maximum and third 
	    // maximum element 
	    int maxA = Integer.MIN_VALUE, maxB = Integer.MIN_VALUE, maxC = Integer.MIN_VALUE; 
	  
	    // Initialize Minimum and second mimimum element 
	    int minA = Integer.MAX_VALUE, minB = Integer.MAX_VALUE; 
	  
	    for (int i = 0; i < n; i++) 
	    { 
	        // Update Maximum, second maximum and third 
	        // maximum element 
	        if (arr[i] > maxA) 
	        { 
	            maxC = maxB; 
	            maxB = maxA; 
	            maxA = arr[i]; 
	        } 
	  
	        // Update second maximum and third maximum element 
	        else if (arr[i] > maxB) 
	        { 
	            maxC = maxB; 
	            maxB = arr[i]; 
	        } 
	  
	        // Update third maximum element 
	        else if (arr[i] > maxC) 
	            maxC = arr[i]; 
	  
	        // Update Minimum and second mimimum element 
	        if (arr[i] < minA) 
	        { 
	            minB = minA; 
	            minA = arr[i]; 
	        } 
	  
	        // Update second mimimum element 
	        else if(arr[i] < minB) 
	            minB = arr[i]; 
	    } 
	  
	    return max(minA * minB * maxA, 
	               maxA * maxB * maxC); 
		
	}

	private static int max(int i, int j) {
		if(i>j)
			return i;
		else
			return j;
	}

}
