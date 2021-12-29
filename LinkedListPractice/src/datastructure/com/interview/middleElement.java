package datastructure.com.interview;

import java.util.Scanner;

public class middleElement {
	
	class Node{
		int val;
		Node next;
		Node(int val){
			this.val = val;
			next = null;
		}
	}

	Node head = null;
	
	public Node insert(int data) {
		if(head == null) {
			Node newNode = new Node(data);
			head = newNode;
		}
		else {
			Node newNode = new Node(data);
			Node temp = head;
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
			temp = newNode;
		}
		return head;
	}
	
	public void print() {
		Node temp = head;
		System.out.println("Printing linked list");
		while(temp!=null) {
			System.out.println(temp.val);
			temp = temp.next;
		}
	}
	
	public int findMiddle() {
		return 0;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		middleElement me = new middleElement();
		for(int i =0; i<5; i++) {
			System.out.println("Enter the element: ");
			int data = sc.nextInt();
			me.insert(data);
		}
		me.print();
		int middle = me.findMiddle();
	}

}
