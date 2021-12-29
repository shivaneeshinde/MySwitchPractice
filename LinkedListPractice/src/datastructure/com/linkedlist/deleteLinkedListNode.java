package datastructure.com.linkedlist;

public class deleteLinkedListNode {
	
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
	
	public void deleteAtStart() {
		head = head.next;
	}
	
	public void deleteAtPos(int position) {
		int count = 1;
		Node temp = head;
		Node prev = null;
		while(count != position) {
			prev = temp;
			temp = temp.next;
			count++;
		}
		prev.next = temp.next;
	}
	
	public void deleteAtEnd() {
		Node temp = head;
		Node prev = null;
		while(temp.next != null) {
			prev = temp;
			temp = temp.next;
		}
		prev.next = null;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		deleteLinkedListNode delList = new deleteLinkedListNode();
		for(int i=1;i<8;i++) {
			delList.add(i);
		}
		System.out.println("Before delete LL");
		delList.print();
		delList.deleteAtEnd();
		System.out.println("After delete LL end");
		delList.print();
		delList.deleteAtStart();
		System.out.println("After delete LL start");
		delList.print();
		delList.deleteAtPos(2);
		System.out.println("After delete LL at pos 2");
		delList.print();
	}

}
