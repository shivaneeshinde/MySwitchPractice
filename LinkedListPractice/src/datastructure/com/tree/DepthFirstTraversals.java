package datastructure.com.tree;


public class DepthFirstTraversals {
	
	static class Node{
		int data;
		Node left;
		Node right;
		public Node(int data) {
			this.data = data;
			left = null;
			right = null;
		}
	}
	
	public void insert(Node temp, int data) {
		if(temp.left==null && temp.right==null) {
			temp.left = new Node(data);
		}
		else if(temp.left==null && temp.right!=null) {
			temp.left = new Node(data);
		}
		else if(temp.left!=null && temp.right==null) {
			temp.right = new Node(data);
		}
		else if(temp.left!=null && temp.right!=null) {
			insert(temp.left, data);  
		}
	}
	
	public void inOrderTrav(Node root) {
		if(root == null)
			return;
		if(root.left!=null)
			inOrderTrav(root.left);
		System.out.print(root.data+" ");
		if(root.right!=null)
			inOrderTrav(root.right);
	}
	
	public void postOrderTrav(Node root) {
		if(root==null)
			return;
		if(root.left!=null)
			postOrderTrav(root.left);
		if(root.right!=null)
			postOrderTrav(root.right);
		System.out.print(root.data+" ");
		
	}
	
	public void preOrderTrav(Node root) {
		if(root == null)
			return;
		System.out.print(root.data+" ");
		if(root.left!=null)
			inOrderTrav(root.left);
		if(root.right!=null)
			inOrderTrav(root.right);
	}

	public static void main(String[] args) {
		DepthFirstTraversals dft = new DepthFirstTraversals();
		Node root = new Node(1);
		int arr[] = {2,3,4,5,6,7};
		for(int i=0; i<arr.length; i++) {
			dft.insert(root, arr[i]);
		}
		System.out.println("InOrder traversal: ");
		dft.inOrderTrav(root);
		System.out.println();
		System.out.println("PreOrder traversal: ");
		dft.preOrderTrav(root);
		System.out.println();
		System.out.println("PostOrder traversal: ");
		dft.postOrderTrav(root);
	}

}
