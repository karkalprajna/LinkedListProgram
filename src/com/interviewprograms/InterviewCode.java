package com.interviewprograms;

import java.util.Iterator;

public class InterviewCode implements Iterator<Integer> {
	int f1 = 1;
	int f2 = 1;
	public static void main(String[] args) {
		// TODO iterator infinet series of 1
		// 1 1 2 3 5q
		InterviewCode obj = new InterviewCode();
		
		if(obj.next() == 2){
			System.out.println("its a fibansis series");
			
		}else{
			System.out.println("not a fibansis series");
		}
		if(obj.next() == 4){
			System.out.println("its a fibansis series");
		}else{
			System.out.println("not a fibansis series");
		}
		

	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public Integer next() {
		// TODO Auto-generated method stub
		int f3 = f1+f2; 
		f1 = f2;
		f2 = f3;
		return f3;
	}

}
