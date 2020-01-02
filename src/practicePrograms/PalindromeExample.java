package practicePrograms;

public class PalindromeExample {
	
	public static void main(String args[]){ 
		System.out.println(isPalindrome(929));
	}	  

	private static boolean isPalindrome(int n) {
		int sum = 0, temp = n;
		while (n > 0) {
			sum = (sum * 10) + n % 10;
			n = n / 10;
		}
		return (temp == sum)?true:false;
	}
	  
}
