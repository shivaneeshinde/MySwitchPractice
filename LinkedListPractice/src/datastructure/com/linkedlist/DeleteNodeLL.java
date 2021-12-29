package datastructure.com.linkedlist;

public class DeleteNodeLL {
	
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
			temp.next=newNode;
		}
	}
	
	public void print() {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
	
	public void delete(int d) {
		Node temp = head;
		Node prev = null;
		if(temp.data == d && temp.next!=null) {
			head = temp.next;			
		}
		else {
			while(temp!=null && temp.data!= d) {
				prev = temp;
				temp = temp.next;
			}
			if(temp==null) {
				System.out.println("Key not found");
			}
			else {
				prev.next = temp.next;
			}
		}
	}

	public static void main(String[] args) {
		DeleteNodeLL dl = new DeleteNodeLL();
		for(int i=1;i<5;i++) {
			dl.insert(i);
		}
		System.out.println("List before deletion: ");
		dl.print();
		dl.delete(7);
		System.out.println("List after deletion: ");
		dl.print();
	}

}
