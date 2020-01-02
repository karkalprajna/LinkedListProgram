package practicePrograms;

public class BirthdayCakeCandles {

	public static void main(String[] args) {
		int ar[] = {3 ,2, 1, 3};
		System.out.println(birthdayCakeCandle(ar));
	}

	private static int birthdayCakeCandle(int[] ar) {
		//find the max element
        int max = ar[0];
        int count = 0;
        for(int i=1;i<ar.length;i++){
            if(ar[i]>max)
                max = ar[i];
        }
        //count the occurrence of that element
        for(int i=0;i<ar.length;i++){
            if(ar[i] == max){
                count++;
            }
        }
        return count;
		
	}

}
