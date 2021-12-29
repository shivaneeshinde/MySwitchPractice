package datastructure.com.linkedlist;

public class InsertLLPractice {
	
	class Node{
		int data;
		Node next;
		
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	Node head;
	
	public void insert(int val) {
		
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
	
	public static void main(String args[]) {
		
		InsertLLPractice inP = new InsertLLPractice();
		
		for(int i=1;i<5;i++) {
			inP.insert(i);
		}
		
		inP.print();
		
	}

}
