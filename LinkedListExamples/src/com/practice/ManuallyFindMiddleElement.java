package com.practice;

class Node{
	int data;
	Node next;
	
	Node(int data){
		this.data = data;
		this.next = null;
	}
}

public class ManuallyFindMiddleElement{
	
	Node head;
	
	public void add(int data) {
		
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		
		Node temp = head;
		
		while(temp.next != null) {
			temp = temp.next;
		}
		
		temp.next = newNode;
	}
	
	public void FindMiddle() {
		Node slow = head;
		Node fast = head;
		
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		System.out.println("Middle Element is: "+slow.data);
	}
	
	public void display() {
		Node temp = head;
		
		while(temp != null) {
			System.out.print(temp.data+" -> ");
			temp = temp.next;
		}
		System.out.print("null");
	}
	
	public static void main(String[] args) {
		ManuallyFindMiddleElement list = new ManuallyFindMiddleElement();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		System.out.print("Linked List: ");
		list.display();
		System.out.println();
		
		list.FindMiddle();
	}
}

