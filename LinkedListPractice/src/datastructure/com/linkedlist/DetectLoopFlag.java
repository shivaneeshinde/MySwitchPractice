package datastructure.com.linkedlist;

public class DetectLoopFlag {
	
	class Node{
		int data;
		Node next;
		int flag;
		public Node(int data) {
			this.data = data;
			flag = 0;
			next = null;
		}
	}
	Node head;
	
	public void insertNode(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}
	
	public void insertLoop() {
		head.next.next.next.next.next = head.next.next;
	}
	
	public boolean detectLoop() {
		Node temp = head;
		while(temp!=null) {
			if(temp.flag == 1)
				return true;
			temp.flag = 1;
			temp = temp.next;
		}
		return false;
	}

	public static void main(String[] args) {
		DetectLoopFlag dl = new DetectLoopFlag();
		int arr[] = {1,2,3,4,5};
		for(int i=0; i<arr.length; i++) {
			dl.insertNode(arr[i]);
		}
		dl.insertLoop();
		boolean flag = dl.detectLoop();
		if(flag) {
			System.out.println("Loop is detected");
		}
		else {
			System.out.println("Loop is not detected");
		}
	}

}
