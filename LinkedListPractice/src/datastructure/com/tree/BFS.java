package datastructure.com.tree;

public class BFS {
	
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
	
	public void breadthFirstTraversal(Node node) {
		if(node != null) {
			System.out.print(node.data+" ");
			if(node.left!=null)
				breadthFirstTraversal(node.left);
			if(node.right!=null)
				breadthFirstTraversal(node.right);
		}
	}

	public static void main(String[] args) {
		Node node = new Node(1);
		BFS bt = new BFS();
		bt.insertLevelOrder(node, 2);
		bt.insertLevelOrder(node, 3);
		bt.insertLevelOrder(node, 4);
		bt.insertLevelOrder(node, 5);
		System.out.println();
		System.out.println("Printing breadth first traversal");
		bt.breadthFirstTraversal(node);
	}

}
