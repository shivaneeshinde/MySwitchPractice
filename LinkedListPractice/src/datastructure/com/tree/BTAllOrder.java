package datastructure.com.tree;

public class BTAllOrder {
	
	static class Node{
		int val;
		Node left;
		Node right;
		Node(int val){
			this.val = val;
			left = null;
			right = null;
		}
	}
	static Node root;
	
	public void insertNode(int data) {
		if(root == null) {
			root = new Node(data);
		}
		else {
			insertNodeData(root, data);;
		}
	}
	
	public void insertNodeData(Node node, int data) {
		if(node.val > data) {
			if(node.left != null) {
				insertNodeData(node.left, data);
			}
			else {
				node.left = new Node(data);
			}
		}
		else if(node.val < data) {
			if(node.right != null) {
				insertNodeData(node.right, data);;
			}
			else {
				node.right = new Node(data);
			}
		}
	}
	
	public void inOrderTraversal(Node node) {
		if(node != null) {
			inOrderTraversal(node.left);
			System.out.print(node.val+" ");
			inOrderTraversal(node.right);
		}
	}
	
	public void postOrderTraversal(Node node) {
		if(node != null) {
			postOrderTraversal(node.left);
			postOrderTraversal(node.right);
			System.out.print(node.val+" ");
		}
	}
	
	public void preOrderTraversal(Node node) {
		if(node != null) {
			System.out.print(node.val+" ");
			preOrderTraversal(node.left);
			preOrderTraversal(node.right);
		}
	}
	
	public static void main(String args[]) {
		BTAllOrder bt = new BTAllOrder();
		bt.insertNode(7);
		bt.insertNode(3);
		bt.insertNode(1);
		bt.insertNode(10);
		bt.insertNode(2);
		bt.insertNode(9);
		System.out.println("Printing the binary tree now");
		bt.inOrderTraversal(root);
		System.out.println();
		System.out.println("Printing Pre order binary tree");
		bt.preOrderTraversal(root);
		System.out.println();
		System.out.println("Printing Post order binary tree");
		bt.postOrderTraversal(root);
	}

}
