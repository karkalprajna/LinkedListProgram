package com.LinkedList.V1;

public class LargestTwoElements {
	public static void main(String args[]) {
		int elements[] = {10,20,40,70};
		System.out.println(getSecondMax(elements));
	}

	private static int getSecondMax(int[] elements) {
		int largest1;
		int largest2;

		largest1 = elements[0];
		largest2 = elements[1];

		if (largest1 < largest2) {
			int flag = largest1;
			largest1 = largest2;
			largest2 = flag;
		}

		for (int i = 2; i < elements.length; i++) {
			if (elements[i] > largest1) {
				largest2 = largest1;
				largest1 = elements[i];
			} else if (elements[i] > largest2 && elements[i] != largest1) {
				largest2 = elements[i];
			}
		}

		return largest2;

	}

}
