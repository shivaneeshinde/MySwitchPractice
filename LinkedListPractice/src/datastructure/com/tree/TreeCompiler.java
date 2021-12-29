package datastructure.com.tree;

public class TreeCompiler {
	
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
	int width = 0;
	int depth = 0;
	
	public void insert(Node root, int data) {
		if(root.data > data) {
			if(root.left!=null) {
				insert(root.left, data);
			}
			else if(root.left == null && root.data > data)
				root.left = new Node(data);
		}
		else {
			if(root.right!=null) {
				insert(root.right, data);
			}
			else if(root.right == null && root.data < data)
				root.right = new Node(data);
		}
	}
	
	public void inOrderTrav(Node root) {
		if(root == null)
			return;
		inOrderTrav(root.left);
		System.out.print(root.data+" ");
		inOrderTrav(root.right);
	}
	
	public void preOrderTrav(Node root) {
		if(root == null)
			return;
		System.out.print(root.data+" ");
		inOrderTrav(root.left);
		inOrderTrav(root.right);
	}
	
	public void postOrderTrav(Node root) {
		if(root == null)
			return;
		inOrderTrav(root.left);
		inOrderTrav(root.right);
		System.out.print(root.data+" ");
	}
	
	public void calculateWidthHeight(Node root, int key) {
		if(root.data == key) {
			System.out.println("width of node in tree is: "+width);
			depth = calculateDepth(root);
			System.out.println("depth of node in tree is: "+depth);
		}
		else if(root.data > key) {
			width++;
			calculateWidthHeight(root.left, key);
		}
		else {
			width++;
			calculateWidthHeight(root.right, key);
		}
	}
	
	public int calculateDepth(Node root) {
		if(root == null)
			return 0;
		int lheight = calculateDepth(root.left)+1;
		int rheight = calculateDepth(root.right)+1;
		return (lheight > rheight) ? lheight : rheight;
	}
	
	public int calculateHeight(Node root) {
		if(root == null)
			return 0;
		int lheight = calculateHeight(root.left)+1;
		int rheight = calculateHeight(root.right)+1;
		return (lheight > rheight) ? lheight : rheight;
	}
	
	public static void main(String[] args) {
		TreeCompiler tr = new TreeCompiler();
		Node root = new Node(5);
		int arr[] = {3,4,1,6,7};
		for(int i=0; i<arr.length; i++) {
			tr.insert(root, arr[i]);
		}
		System.out.println("InOrder traversal: ");
		tr.inOrderTrav(root);
		System.out.println();
		System.out.println("PreOrder traversal: ");
		tr.preOrderTrav(root);
		System.out.println();
		System.out.println("PostOrder traversal: ");
		tr.postOrderTrav(root);
		System.out.println();
		int height = tr.calculateHeight(root);
		System.out.println("Complete height of the tree is: "+height);
		tr.calculateWidthHeight(root, 3);
	}

}
