package datastructure.com.tree;

public class BinarySearchTree {
	
	static class Node{
		int val;
		Node right;
		Node left;
		Node(int val){
			this.val = val;
			right = null;
			left = null;
		}
	}
	
	public void insertNode(Node node, int data) {
		if(node.val > data) {
			if(node.left != null) {
				insertNode(node.left, data);
			}
			else {
				node.left = new Node(data);
			}
		}
		else if(node.val < data) {
			if(node.right != null) {
				insertNode(node.right, data);
			}
			else {
				node.right = new Node(data);
			}
		}
	}
	
	public void traversal(Node node) {
		if(node != null) {
			traversal(node.left);
			System.out.print(node.val + " ");
			traversal(node.right);
		}
	}
	
	public static void main(String args[]) {
		
		Node root = new Node(5);
		BinarySearchTree bt = new BinarySearchTree();
		bt.insertNode(root, 7);
		bt.insertNode(root, 3);
		bt.insertNode(root, 1);
		bt.insertNode(root, 10);
		bt.insertNode(root, 2);
		bt.insertNode(root, 9);
		System.out.println("Printing the binary tree now");
		bt.traversal(root);
	}

}
