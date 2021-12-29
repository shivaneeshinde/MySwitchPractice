package datastructure.com.linkedlist;


public class recLengthLinkList {
	
	
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
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
	public int lengthList(Node head) {
		if(head == null) {
			return 0;
		}
		else {
			return 1+lengthList(head.next);
		}
	}
	
	public int calc() {
		return lengthList(head);
	}

	public static void main(String[] args) {
		recLengthLinkList inList = new recLengthLinkList();
		for(int i=1;i<4;i++) {
			inList.add(i);
		}
		inList.print();
		int len = inList.calc();
		System.out.println("Length of linked list is: "+len);
	}
	

}
