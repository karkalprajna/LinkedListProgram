package practicePrograms;

import java.util.HashSet;
import java.util.Scanner;

public class SockMerchant {
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
			int n = scanner.nextInt();
			int[] ar = new int[n];
			
			Scanner scanner2 = new Scanner(System.in);
			String arItemsval = scanner2.nextLine();
			String[] arItems =  arItemsval.split(" ");

			for (int i = 0; i < n; i++) {
				int arItem = Integer.parseInt(arItems[i]);
				ar[i] = arItem;
			}

			int result = sockMerchant(n, ar);

			System.out.println(result);
			scanner2.close();
			scanner.close();
	}

	private static int sockMerchant(int n, int[] ar) {
		int socksPairCount=0;
		HashSet<Integer> socks = new HashSet<>();
		for(int i = 0;i<n;i++){
			if(!socks.contains(ar[i])){
				socks.add(ar[i]);
			}else{
				socksPairCount++;
				socks.remove(ar[i]);
			}
		}
		return socksPairCount;
	}

}
