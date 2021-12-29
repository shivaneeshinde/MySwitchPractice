package datastructure.com.linkedlist;

public class DeleteNodeByPosLL {
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
	}
	
	public void delete(int pos) {
		Node temp = head, prev = null;
		int count =1;
		if(pos == 1) {
			head = temp.next;
		}
		else {
			while(temp != null && pos!=count) {
				count++;
				prev = temp;
				temp = temp.next;
			}
			if(temp == null) {
				System.out.println("Not found");
			}
			else {
				prev.next = temp.next;
			}
		}
	}
	
	public static void main(String[] args) {
		DeleteNodeLL dl = new DeleteNodeLL();
		for(int i=1; i<6;i++) {
			dl.insert(i);
		}
		System.out.println("Linked list before delete: ");
		dl.print();
		dl.delete(6);
		System.out.println("Linked list after delete at pos: ");
		dl.print();
	}

}
