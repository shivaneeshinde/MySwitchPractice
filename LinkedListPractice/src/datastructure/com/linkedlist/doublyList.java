package datastructure.com.linkedlist;

import java.util.Scanner;

public class doublyList {
	
	class Node{
		int val;
		Node next;
		Node prev;
		Node(int val){
			this.val = val;
			next=null;
			prev=null;
		}
	}
	
	Node head = null;
	Node tail = null;
	
	public void insert(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			tail = newNode;
		}
		else {
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
		}
	}
	
	public void print() {
		Node temp = head;
		while(temp!=null) {
			System.out.println(temp.val);
			temp = temp.next;
		}
	}
		
	public void printReverse() {
		Node temp = tail;
		while(temp!=null) {
			System.out.println(temp.val);
			temp = temp.prev;
		}
	}
	
	public static void main(String args[]) {
		doublyList dl = new doublyList();
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<4; i++) {
			System.out.println("Enter the element: ");
			int data = sc.nextInt();
			dl.insert(data);
		}
		dl.print();
		dl.printReverse();
	}

}
