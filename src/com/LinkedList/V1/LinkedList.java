package com.LinkedList.V1;

public class LinkedList {
	private Node head;
	private Node tail;
		
	public Node head(){
		return head;
	}
	
	public Node tail(){
		return tail;
	}
	
	public void add(Node node) {
		if (head != null) {
			tail.next = node;
			tail = node;
		} else {
			tail = head = node;			
		}
	}

	public static class Node {
		private Node next;
		private String data;

		Node(String data) {
			this.data = data;
			next = null;
		}

		public Node next() {
			return next;
		}
		
		public void setNext(Node next) {
			this.next = next;
		}
		
		public String data(){
			return data;
		}

	}
}
