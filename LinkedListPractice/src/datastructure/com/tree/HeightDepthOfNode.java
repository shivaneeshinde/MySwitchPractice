package datastructure.com.tree;

public class HeightDepthOfNode {
	
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
	int width = 0;
	int height = 0;
	int rheight = 0;
	int lheight = 0;
	
	public void insertNode(Node node, int val) {
		if(node.data > val) {
			if(node.left != null) {
				insertNode(node.left, val);
			}
			else {
				node.left = new Node(val);
			}
		}
		else if(node.data < val) {
			if(node.right != null) {
				insertNode(node.right, val);
			}
			else {
				node.right = new Node(val);
			}
		}
	}
	
	public void travserval(Node node) {
		if(node != null) {
			travserval(node.left);
			System.out.print(node.data +" ");
			travserval(node.right);
		}
	}
	
	public void calculateHeightAndWidth(Node node, int key) {
		if(node.data == key) {
			System.out.println("width of key is: "+width);
			calculateHeight(node);
			System.out.println("height of key is: "+height);
		}
		else {
			if(node.data > key) {
				width++;
				calculateHeightAndWidth(node.left, key);
			}
			else if(node.data < key) {
				width++;
				calculateHeightAndWidth(node.right, key);
			}
		}	
	}
	
	public int calculateHeight(Node node) {
		if(node == null)
			return -1;
		else {
			rheight = calculateHeight(node.right)+1;
			lheight = calculateHeight(node.left)+1;
		}
		height = (rheight > lheight) ? rheight : lheight;
		return height;
	}
	
	public static void main(String[] args) {
		Node root = new Node(5);
		HeightDepthOfNode bt = new HeightDepthOfNode();
		bt.insertNode(root, 2);
		bt.insertNode(root, 10);
		bt.insertNode(root, 8);
		bt.insertNode(root, 6);
		bt.insertNode(root, 3);
		bt.insertNode(root, 1);
		System.out.println("Printing Tree");
		bt.travserval(root);
		System.out.println();
		bt.calculateHeightAndWidth(root,10);
	}
}
