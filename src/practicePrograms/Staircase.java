package practicePrograms;

public class Staircase {

	public static void main(String[] args) {
		int n = 6;
		staircase(n);

	}

	private static void staircase(int n) {
		int i=1;
		while(i<=n){
			int space = n-i;
			int hash = n-space;
			while(space>0){
				System.out.print(" ");
				space--;
			}			
			while(hash>0){
				System.out.print("#");
				hash--;
			}
			System.out.println("");
			i++;
		}
		
	}

}
