package com.LinkedList.V1;

public class InsertElements extends LinkedList{

	public static void main(String args[]) {
		LinkedList linkedList = new LinkedList();
		linkedList.add(new LinkedList.Node("1"));
		linkedList.add(new LinkedList.Node("2"));
		linkedList.add(new LinkedList.Node("3"));
		linkedList.add(new LinkedList.Node("4"));
		
		makeCircularLinkedList(linkedList);
		
		printList(linkedList);
		checkCycle(linkedList);
	}

	private static void makeCircularLinkedList(LinkedList linkedList) {
		Node tail = linkedList.tail();
		tail.setNext(linkedList.head());
	}

	private static void checkCycle(LinkedList linkedList) {
		Node head = linkedList.head();
		Node current = linkedList.head();
		while(current.next() != null){
			if(head == current.next()){
				System.out.println(" cycle exist");
				return;
			}
			current = current.next();			
		}
		System.out.println(" cycle do not exist");
	}

	private static void printList(LinkedList linkedList) {
		Node current = linkedList.head();
		while(current != null){
			if(current.next() == linkedList.head()){
				System.out.println(current.data()+" ");
				return;
			}
			System.out.println(current.data()+" ");
			current = current.next();
		}
	}
	
	
}
