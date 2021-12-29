package datastructure.com.linkedlist;

public class PairwiseSwapLinkedList {
	
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
	
	public void swap() {
		Node temp = head;
		Node prev = null;
		while(temp!=null) {
			if(temp == head) {
				prev = temp;
				temp = temp.next;
			}	
			System.out.println("prev is: "+prev.data);
			System.out.println("temp is: "+temp.data);
			int d1 = prev.data;
			int d2 = temp.data;
			prev.data = d2;
			temp.data = d1;
			prev = temp.next;
			if(prev==null)
				break;
			else
				temp = prev.next;
		}
	}
	
	public void pairwiseSwap()
    {
        // code here
        Node temp = head;
        Node newNode = new Node(0);
        Node tail = newNode;
        while(temp!=null){
            if(temp.next!=null){
                Node temp1 = new Node(temp.data);
                Node temp2 = new Node(temp.next.data);
                tail.next = temp2;
                tail = temp2;
                tail.next = temp1;
                tail = temp1;
                temp = temp.next.next;
            }
            else{
            	Node temp1 = new Node(temp.data);
                tail.next = temp1;
                tail = temp1;
                temp = temp.next;
            }
            
        }
        head = newNode.next;
    }

	public static void main(String[] args) {
		PairwiseSwapLinkedList inList = new PairwiseSwapLinkedList();
		//int[] arr = {1,1,1,1,2,3,4,4,4,4,4};
		for(int i=1;i<8;i++) {
			inList.addAtLAst(i);
		}		
		inList.print();
		inList.pairwiseSwap();
		//inList.swap();
		System.out.println("after swapping");
		inList.print();
	}
	
}
