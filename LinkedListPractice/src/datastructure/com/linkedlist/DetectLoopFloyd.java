package datastructure.com.linkedlist;

public class DetectLoopFloyd {
	
	class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
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
		Node low = head, high = head, temp = head;
		while(temp != null && high.next !=null) {
			low = low.next;
			high = high.next.next;
			temp = temp.next;
			if(low == high)
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		DetectLoopFloyd dl = new DetectLoopFloyd();
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
