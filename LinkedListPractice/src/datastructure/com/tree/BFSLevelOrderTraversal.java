package datastructure.com.tree;

//Level order traversal of a tree is breadth first traversal for the tree.

public class BFSLevelOrderTraversal {
	
	static class Node{
		int data;
		Node right;
		Node left;
		public Node(int data) {
			this.data = data;
			right = null;
			left = null;
		}
	}
	
	public void insert(Node root, int data) {
		Node newNode = new Node(data);
		if(root.left == null && root.right == null) {
			root.left = newNode;
		}
		else if(root.left == null && root.right != null) {
			root.left = newNode;
		}
		else if(root.left != null && root.right == null) {
			root.right = newNode;
		}
		else if(root.left != null && root.right != null) {
			insert(root.left, data);
		}
	}
	
	public void levelOrderTrav(Node root) {
		int height = calculateHeight(root);
		System.out.println("Height of tree is: "+height);
		for(int i=1;i<=height; i++) {
			printCurrentLevel(root, i);
		}
	}
	
	public int calculateHeight(Node root) {
		if(root == null)
			return 0;
		else {
			int lheight = calculateHeight(root.left);
			int rheight = calculateHeight(root.right);
			if(lheight > rheight)
				return lheight+1;
			else
				return rheight+1;
		}
	}
	
	public void printCurrentLevel(Node root, int level) {
		if(root == null) {
			return;
		}
		if(level == 1) {
			System.out.print(root.data+" ");
		}
		else if(level > 1) {
			printCurrentLevel(root.left, level-1);
			printCurrentLevel(root.right, level-1);
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
		BFSLevelOrderTraversal lot = new BFSLevelOrderTraversal();
		Node root = new Node(1);
		int arr[] = {2,3,4,5,6,7};
		for(int i=0; i<arr.length; i++) {
			lot.insert(root, arr[i]);
		}
		lot.levelOrderTrav(root);
		System.out.println();
		System.out.println("breadth first traversal: ");
		lot.breadthFirstTraversal(root);
	}

}
