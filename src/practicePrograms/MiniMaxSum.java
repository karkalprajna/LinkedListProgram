package practicePrograms;

public class MiniMaxSum {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		miniMaxSum(arr);
	}

	private static void miniMaxSum(int[] arr) {
		int minSum = 0;
        int maxSum = 0;
        int count = 0;
        int sum = 0;
        int[] tempSum = new int[arr.length];
        
        while(count<arr.length){
        	sum = 0;
            for(int k=0;k<arr.length;k++){
                if(k!=count){
                    sum += arr[k];
                }
            }
            tempSum[count] = sum;
            count++;
        }
        //max sum
        maxSum = tempSum[0];
        for(int i=0;i<tempSum.length;i++){
            if(tempSum[i]>maxSum){
                maxSum = tempSum[i];
            }
        }

        //min sum
        minSum = tempSum[0];
        for(int i=0;i<tempSum.length;i++){
            if(tempSum[i]<minSum){
                minSum = tempSum[i];
            }
        }
        
        System.out.println(minSum +" "+maxSum);
		
	}

}
