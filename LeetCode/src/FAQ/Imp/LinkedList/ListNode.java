package FAQ.Imp.LinkedList;

public class ListNode {
	
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
	
	public void addAtFirst(int val) {
		Node newNode = new Node(val);
		newNode.next = head;
		head = newNode;
	}
	
	public void addAtPosition(int val, int position) {
		Node newNode = new Node(val);
		Node temp = head;
		int count = 1;
		if(position == 1) {
			addAtFirst(val);
		}
		else {
			while(count!=position) {
				temp = temp.next;
				count++;
			}
			System.out.println("temp data is: "+temp.data);
			newNode.next = temp.next;
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
	
	public ListNode returnList() {
		ListNode inList = new ListNode();
		for(int i=1;i<4;i++) {
			inList.addAtLAst(i);
		}
		for(int i=4;i<6;i++) {
			inList.addAtFirst(i);
		}
		inList.addAtPosition(10, 2);
		return inList;
	}

	public static void main(String[] args) {
		ListNode inList = new ListNode();
		for(int i=1;i<4;i++) {
			inList.addAtLAst(i);
		}
		for(int i=4;i<6;i++) {
			inList.addAtFirst(i);
		}
		inList.addAtPosition(10, 2);
		
		inList.print();
	}

}
