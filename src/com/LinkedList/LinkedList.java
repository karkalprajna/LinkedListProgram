package com.LinkedList;

public class LinkedList {
	static class Node{
		int data;
		Node next;
		
		Node (int d){
			data = d;
			next = null;
		}
	}
	
	Node header;
	Node tail;
	
	public static void main(String args[]){
		//ctrate a linked list
		
		LinkedList linkedList = new LinkedList();
		linkedList.header = new Node(5);
		Node secound = new Node(10);
		Node third = new Node(15);
		Node fourth = new Node(20);
		Node fifth = new Node(25);
		
		linkedList.header.next = secound;
		secound.next = third;
		third.next = fourth;
		fourth.next = fifth;
		
		//print linklist
		//printList(linkedList);
		
		//find the middle element
		//findMiddleElement(linkedList);
		int number[] = {10,20,15,40,16};
		int largest = linkedList.findMaximumElement(number);
		System.out.println("largest element" +largest);
	}

	private static void findMiddleElement(LinkedList linkedList) {
		Node current = linkedList.header;
		int length = 0;
		Node middle = linkedList.header;
		
		while(current != null){
			length++;
			 if(length%2 ==0){
	              middle = middle.next;
	          }
			 current = current.next;
		}
		System.out.println("Middle element is : "+middle.data);
	}

	private static void printList(LinkedList linkedList) {
		Node n = linkedList.header;
		while(n != null){
			System.out.println(n.data);
			n = n.next;			
		}
	}
	
	private int findMaximumElement(int number[]){
		int largest = number[0];
		for(int i=0; i<number.length ; i++){
			if(largest < number[i]){				
				largest = number[i];
			}
		}
		return largest;
	}
	
}
