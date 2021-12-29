package datastructure.com.tree;

public class TreeHeight {
	
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
	
	public void calculateHeight(Node node) {
		int lcount = 1;
		int rcount = 1;
		Node leftNode = node;
		Node rightNode = node;
		while(leftNode != null) {
			leftNode = leftNode.left;
			lcount++;
		}
		while(rightNode != null) {
			rightNode = rightNode.right;
			rcount++;
		}
		int h = (lcount > rcount)? lcount : rcount;
		System.out.println("Height of tree is: "+ h);
	}
	
	public void calculateWidth(Node node) {
		int w =1;
		Node right = node.right;
		Node left = node.left;
		while(right != null || left != null) {
			
		}
	}

	public static void main(String[] args) {
		Node root = new Node(5);
		TreeHeight bt = new TreeHeight();
		bt.insertNode(root, 2);
		bt.insertNode(root, 10);
		bt.insertNode(root, 8);
		bt.insertNode(root, 6);
		bt.insertNode(root, 3);
		bt.insertNode(root, 1);
		System.out.println("Tree before deletion");
		bt.travserval(root);
		System.out.println();
		bt.calculateHeight(root);
		bt.calculateWidth(root);
	}

}
