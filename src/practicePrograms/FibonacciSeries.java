package practicePrograms;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String args[]){
		System.out.println("Enter the element fibonacci series to be print");
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		int n = s.nextInt(); 
		
		for(int i=1; i<=n; i++){
			System.out.println(fibonacci(i));
		}
	}

	private static int fibonacci(int number) {
		if(number == 1 || number == 2){ return 1;}
		return fibonacci(number-1)+fibonacci(number-2);
	}
}
