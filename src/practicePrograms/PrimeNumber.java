package practicePrograms;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String args[]){
		System.out.println("Enter the number to be checked as prime");
		Scanner s = new Scanner(System.in);
		int number = s.nextInt();
		
		System.out.println("is prime number :"+isPrime(number));
	}

	private static boolean isPrime(int number) {
		if(number == 2 || number == 3){
			return true;
		}
		int sqrt = (int) Math.sqrt(number)+1;
		for(int i=3 ; i<sqrt ; i++){
			if(number % i == 0){
				return false;
			}
		}
		return true;
	}
}
