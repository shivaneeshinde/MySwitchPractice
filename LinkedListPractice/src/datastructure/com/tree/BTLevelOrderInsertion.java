package datastructure.com.tree;

public class BTLevelOrderInsertion {
	
	static class Node{
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data = data;
			left = null;
			right = null;
		}
	}
	
	public void insertLevelOrder(Node node, int data) {
		if(node.left!=null && node.right!=null) {
			insertLevelOrder(node.left, data);
		}
		else if(node.left!=null && node.right==null) {
			node.right = new Node(data);
		}
		else if(node.left==null && node.right!=null) {
			node.left = new Node(data);
		}
		else if(node.left==null && node.right==null) {
			node.left = new Node(data);
		}
	}
	
	public void inOrderTraversal(Node node) {
		if(node != null) {
			inOrderTraversal(node.left);
			System.out.print(node.data+" ");
			inOrderTraversal(node.right);
		}
	}
	
	public void postOrderTraversal(Node node) {
		if(node != null) {
			postOrderTraversal(node.left);
			postOrderTraversal(node.right);
			System.out.print(node.data+" ");
		}
	}
	
	public void preOrderTraversal(Node node) {
		if(node != null) {
			System.out.print(node.data+" ");
			preOrderTraversal(node.left);
			preOrderTraversal(node.right);
		}
	}

	public static void main(String[] args) {
		Node node = new Node(5);
		BTLevelOrderInsertion bt = new BTLevelOrderInsertion();
		bt.insertLevelOrder(node, 8);
		bt.insertLevelOrder(node, 1);
		bt.insertLevelOrder(node, 4);
		bt.insertLevelOrder(node, 9);
		bt.insertLevelOrder(node, 6);
		bt.insertLevelOrder(node, 2);
		bt.insertLevelOrder(node, 5);
		System.out.println("Printing level order binary tree");
		bt.inOrderTraversal(node);
		System.out.println();
		System.out.println("Printing Pre order binary tree");
		bt.preOrderTraversal(node);
		System.out.println();
		System.out.println("Printing Post order binary tree");
		bt.postOrderTraversal(node);
	}

}
