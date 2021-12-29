package datastructure.com.tree;

public class treeDsPractice {
	
	class Node{
		int data;
		Node left;
		Node right;
		
		Node(int d){
			data = d;
			left = null;
			right = null;
		}
	}
	
	Node root;
	
	public Node insert(int val) {
		Node newNode = new Node(val);
		return newNode;
	}
	
	public void print(Node head) {
		if(head == null)
			return;
		print(head.left);
		System.out.print(head.data+" ");
		print(head.right);
	}
	
	public static void main(String args[]) {
		treeDsPractice tr = new treeDsPractice();
		tr.root = tr.insert(1);
		tr.root.left = tr.insert(2);
		tr.root.right = tr.insert(3);
		
		Node temp = tr.root;
		tr.print(temp);
	}

}
