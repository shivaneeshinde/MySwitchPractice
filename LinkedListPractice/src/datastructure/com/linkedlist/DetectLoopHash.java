package datastructure.com.linkedlist;

import java.util.HashSet;
import java.util.Scanner;

public class DetectLoopHash {
	
	 class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
			next = null;
		}
	}
	Node head;
	
	public void insertNode(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}
	
	public void insertLoop() {
		head.next.next.next.next.next = head.next;
	}
	
	public void print() {
		Node temp = head;
		int count = 1;
		while(temp != null && count<20) {
			System.out.print(temp.data+ " ");
			temp = temp.next;
			count = count+1;
		}
	}
	
	public boolean detectLoop() {
		HashSet<Node> set = new HashSet<Node>();
		Node temp = head;
		while(temp!=null) {
			if(set.contains(temp)) {
				return true;
			}
			set.add(temp);
			temp = temp.next;
		}
		return false;
	}

	public static void main(String[] args) {
		DetectLoopHash dl = new DetectLoopHash();
		System.out.println("Enter 5 elements of linked list: ");
		Scanner sc = new Scanner(System.in);
		boolean result;
		for(int i=0; i<5; i++) {
			dl.insertNode(sc.nextInt());
		}	
		result = dl.detectLoop();
		if(result) {
			System.out.println("Loop is detected");
		}
		else {
			System.out.println("Loop is not detected");
		}		
		dl.insertLoop();
		result = dl.detectLoop();
		if(result) {
			System.out.println("Loop is detected");
		}
		else {
			System.out.println("Loop is not detected");
		}	
		System.out.println("Printing linked list with loop");
		dl.print();
	}

}
