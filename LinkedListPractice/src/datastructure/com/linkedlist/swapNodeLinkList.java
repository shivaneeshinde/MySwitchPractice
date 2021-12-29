package datastructure.com.linkedlist;

public class swapNodeLinkList {
	
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
	}
	
	public void swap(int a, int b) {
		Node temp = head;
		while(temp!= null) {
			if(temp.data == a)
				temp.data = b;
			else if(temp.data == b)
				temp.data = a;
			temp = temp.next;
		}
	}


	public static void main(String[] args) {
		swapNodeLinkList inList = new swapNodeLinkList();
		for(int i=1;i<6;i++) {
			inList.add(i);
		}
		System.out.println("Linked list before swap");
		inList.print();
		int x=2, y=4;
		inList.swap(x,y);
		System.out.println("Linked list after swap");
		inList.print();
	}

}
