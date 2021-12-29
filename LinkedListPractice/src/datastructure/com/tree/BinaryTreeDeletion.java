package datastructure.com.tree;

public class BinaryTreeDeletion {
	
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
	
	public void deletion(Node node, int key) {
		Node rightTemp = node;
		Node prev = null;
		Node expectedNode = null;
		while(rightTemp.right != null) {
			prev = rightTemp;
			rightTemp = rightTemp.right;
		}
		System.out.println("right node is "+rightTemp.data);
		expectedNode = findNode(node, key);
		System.out.println("expectedNode node is "+expectedNode.data);
		expectedNode.data = rightTemp.data;
		prev.right = null;
	}
	
	public Node findNode(Node node, int key) {
		System.out.println("node inside find is: "+node.data);
		if(node.data == key) {
			System.out.println("here "+node.data);
			return node;
		}		
		if(node.data > key)
			return findNode(node.left, key);
		else if(node.data < key)
			return findNode(node.right, key);
		return null;
	}

	public static void main(String[] args) {
		Node root = new Node(5);
		BinaryTreeDeletion bt = new BinaryTreeDeletion();
		bt.insertNode(root, 2);
		bt.insertNode(root, 10);
		bt.insertNode(root, 8);
		bt.insertNode(root, 6);
		bt.insertNode(root, 3);
		bt.insertNode(root, 1);
		System.out.println("Tree before deletion");
		bt.travserval(root);
		System.out.println();
		bt.deletion(root, 8);
		System.out.println("Tree after deletion");
		bt.travserval(root);
	}

}
