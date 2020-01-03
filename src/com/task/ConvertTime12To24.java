package com.task;

import java.util.Scanner;
/*
 * Tried to use the least for loop and used if statements.
 * This can also be done with the help of SimpleDateFormat java class.
 * */
public class ConvertTime12To24 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String time12 = s.nextLine();
		//05:30:00 PM
		convertToMilitaryTime(time12);
	}

	private static void convertToMilitaryTime(String time12) {
		
		//remove spaces from string
		time12 = time12.replace(" ", "");
		
		int h1 = Character.getNumericValue(time12.charAt(1));
		int h2 = Character.getNumericValue(time12.charAt(0));
	    int hh = (h2 * 10 + h1 % 10); 
	    
	    if(hh > 12){
	    	System.out.println("Invalid input");
	    	return;
	    }
	    
	    if (time12.charAt(8) == 'A') 
	    { 
	        if (hh == 12) 
	        { 
	            System.out.print("00"); 
	            for (int i = 2; i <= 7; i++) 
	                System.out.print(time12.charAt(i)); 
	        } 
	        else
	        { 
	            for (int i = 0; i <= 7; i++) 
	                System.out.print(time12.charAt(i)); 
	        } 
	    }   
	    else
	    { 
	        if (hh == 12) 
	        { 
	            System.out.print("12"); 
	        } 
	        else
	        { 
	            hh = hh + 12; 
	            System.out.print(hh); 
	        } 
	        for (int i = 2; i <= 7; i++) 
                System.out.print(time12.charAt(i));
	    }
	}
}
