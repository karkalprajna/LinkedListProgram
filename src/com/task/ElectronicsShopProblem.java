package com.task;

import java.util.Scanner;

public class ElectronicsShopProblem {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int dollers = s.nextInt();
		int n = s.nextInt(); //number of keyboard brand
		int m = s.nextInt(); //number of usb brands
		int[] key = new int[n];
		int[] usb = new int[m];
		
		for(int i=0 ; i<n;i++){
			key[i] = s.nextInt();
		}
		
		for(int i=0 ; i<m;i++){
			usb[i] = s.nextInt();
		}
		
		moneySpent(key,usb,dollers);

	}

	private static void moneySpent(int[] key, int[] usb, int dollers) {
		int maxAmtSpent = 0;
		
		for(int i=0; i<key.length;i++){
			for(int j=0; j<usb.length;j++){
				int totalAmt = key[i]+usb[j];
				if(totalAmt <= dollers && totalAmt > maxAmtSpent){
					maxAmtSpent = totalAmt;
				}
			}
		}
		
		if(maxAmtSpent == 0){
			System.out.println("-1");
		}else{
			System.out.println(maxAmtSpent);
		}
		
	}

}
