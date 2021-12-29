package datastructure.com.linkedlist;

import java.util.Scanner;

public class MergeSortedLL {
	
	class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	Node head1;
	Node head2;
	Node head;
	
	public void add1(int val) {
		Node newNode = new Node(val);
		if(head1 == null) {
			head1 = newNode;
		}
		else {
			Node temp = head1;
			while(temp.next!=null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}
	
	public void add2(int val) {
		Node newNode = new Node(val);
		if(head1 == null) {
			head1 = newNode;
		}
		else {
			Node temp = head1;
			while(temp.next!=null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}
	
	public void print() {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	public void merge() {
		head = head1;
		Node temp1 = head, temp2 = head2;
		while(temp1 != null) {
			
		}
	}

	public static void main(String[] args) {
		MergeSortedLL inList = new MergeSortedLL();
		Scanner sc = new Scanner(System.in);
		for(int i=1;i<4;i++) {
			inList.add1(sc.nextInt());
		}
		for(int i=1;i<4;i++) {
			inList.add2(sc.nextInt());
		}
		System.out.println("Linked list before reverse");
		inList.print();
	}

	
}
