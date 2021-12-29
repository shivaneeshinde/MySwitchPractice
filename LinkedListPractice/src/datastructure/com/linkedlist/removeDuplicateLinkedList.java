package datastructure.com.linkedlist;

import java.util.ArrayList;
import java.util.List;

public class removeDuplicateLinkedList {
	
	class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	Node head;
	
	public void addAtLAst(int val) {
		Node newNode = new Node(val);
		if(head == null) {
			head = newNode;
		}
		else {
			Node temp = head;
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
	
	public void remove() {
		List<Integer> list = new ArrayList<Integer>();
		Node temp = head;
		Node prev = null;
		while(temp!=null) {
			if(list.contains(temp.data)) {
				prev.next = temp.next;
				//temp = temp.next;
			}
			else {
				list.add(temp.data);
				prev = temp;
			}
			//prev = temp;
			temp = temp.next;
		}
	}

	public static void main(String[] args) {
		removeDuplicateLinkedList inList = new removeDuplicateLinkedList();
		int[] arr = {1,1,1,1,2,3,4,4,4,4,4};
		for(int i=0;i<arr.length;i++) {
			inList.addAtLAst(arr[i]);
		}		
		inList.print();
		inList.remove();
		System.out.println("after deletion");
		inList.print();
	}

}
