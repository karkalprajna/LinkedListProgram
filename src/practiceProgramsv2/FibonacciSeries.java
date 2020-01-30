package practiceProgramsv2;

public class FibonacciSeries {

	public static void main(String[] args) {
		for(int i=1; i<=5; i++){
			System.out.println(fibonacciSeries(i));
		}
		
	}

	private static int fibonacciSeries(int fib) {
		if(fib == 1 || fib == 2){
			return 1;
		}
		return fibonacciSeries(fib-1)+fibonacciSeries(fib-2);		
	}

}
