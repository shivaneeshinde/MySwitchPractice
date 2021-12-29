package datastructure.com.linkedlist;

public class ReverseLinkListSh {
	
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	Node head;
	
	public void addNode(int val) {
		Node newNode = new Node(val);
		if(head == null) {
			head = newNode;
		}
		else {
			Node temp = head;
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}		
	}
	
	public void revList() {
		Node curr = null;
		Node prev = null;
		Node temp = head;
		while(temp != null) {
			curr = temp;
			temp = temp.next;
			curr.next = prev;
			prev = curr;
			head = curr;
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
		ReverseLinkListSh ll = new ReverseLinkListSh();
		int arr[] = {2,7,1,9,4,5};
		for(int i=0; i<arr.length; i++) {
			ll.addNode(arr[i]);
		}
		System.out.println("Printing linked list before rev");
		ll.print();
		ll.revList();
		System.out.println("Printing linked list after rev");
		ll.print();
	}

}
