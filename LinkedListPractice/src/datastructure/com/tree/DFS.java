package datastructure.com.tree;

public class DFS {
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
	
	public void preOrderTraversal(Node node) {
		if(node != null) {
			System.out.print(node.data+" ");
			inOrderTraversal(node.left);
			inOrderTraversal(node.right);
		}
	}
	
	public void postOrderTraversal(Node node) {
		if(node != null) {
			inOrderTraversal(node.left);
			inOrderTraversal(node.right);
			System.out.print(node.data+" ");
		}
	}

	public static void main(String[] args) {
		Node node = new Node(1);
		DFS bt = new DFS();
		bt.insertLevelOrder(node, 2);
		bt.insertLevelOrder(node, 3);
		bt.insertLevelOrder(node, 4);
		bt.insertLevelOrder(node, 5);
		System.out.println("Printing in order binary tree");
		bt.inOrderTraversal(node);
		System.out.println();
		System.out.println("Printing post order traversal");
		bt.postOrderTraversal(node);
		System.out.println();
		System.out.println("Printing pre order traversal");
		bt.preOrderTraversal(node);
	}
}
