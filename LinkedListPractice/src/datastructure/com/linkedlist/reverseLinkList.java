package datastructure.com.linkedlist;

public class reverseLinkList {
	
	
	class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	Node head;
	
	public void add(int val) {
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
	
	public void reverse() {
		Node temp = head;
		Node prev = null;
		Node curr = null;
		while(temp!=null) {
			curr = temp;
			temp = temp.next;
			curr.next = prev;
			prev = curr;
			head = curr;
		}
	}


	public static void main(String[] args) {
		reverseLinkList inList = new reverseLinkList();
		for(int i=1;i<6;i++) {
			inList.add(i);
		}
		System.out.println("Linked list before reverse");
		inList.print();
		int x=2, y=4;
		inList.reverse();
		System.out.println("Linked list after reverse");
		inList.print();
	}


}
