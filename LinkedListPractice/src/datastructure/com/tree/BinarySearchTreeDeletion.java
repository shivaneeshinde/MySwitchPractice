package datastructure.com.tree;

public class BinarySearchTreeDeletion {
	
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
	Node prev;
	
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
		Node expectedNode = null;
		expectedNode = findNode(node, key);
		System.out.println("expectedNode node is "+expectedNode.data);
		if(expectedNode.right == null && expectedNode.left == null) {
			System.out.println("both nodes are absent: "+ prev.data);
			if(prev.data > expectedNode.data) {
				prev.left = null;
			}
			else if(prev.data < expectedNode.data) {
				prev.right = null;
			}
		}
		if(expectedNode.right == null && expectedNode.left != null) {
			System.out.println("left node is present"+ prev.data);
			if(prev.data > expectedNode.data) {
				prev.left = expectedNode.left;
			}
			else if(prev.data < expectedNode.data) {
				prev.right = expectedNode.left;
			}
		}
		if(expectedNode.right != null && expectedNode.left == null) {
			System.out.println("right node is present"+ prev.data);
			if(prev.data > expectedNode.data) {
				prev.left = expectedNode.left;
			}
			else if(prev.data < expectedNode.data) {
				prev.right = expectedNode.left;
			}
		}
		if(expectedNode.left != null && expectedNode.right != null) {
			//In this case find the minimum value in right side subtree and replace node to be deleted with that value
			int value = findMinRight(expectedNode.right);
			expectedNode.data = value;
		}
	}
	
	public int findMinRight(Node node) {
		System.out.println("Current most node is: "+node.data);
		System.out.println("Current most prev node is: "+ prev.data);
		if(node.left != null) {
	    	prev = node;
	    	return findMinRight(node.left);
	    }
		
		System.out.println("Left most node is: "+node.data+" and previous node: "+prev.data);
		prev.left = null;
		return node.data;
	}
	
	public Node findNode(Node node, int key) {
		System.out.println("node inside find is: "+node.data);
		if(node.data == key) {
			System.out.println("Node found: "+node.data);
			return node;
		}	
		prev = node;
		if(node.data > key)
			return findNode(node.left, key);
		else if(node.data < key)
			return findNode(node.right, key);
		return null;
	}

	public static void main(String[] args) {
		Node root = new Node(8);
		BinarySearchTreeDeletion bt = new BinarySearchTreeDeletion();
        bt.insertNode(root, 10);
        bt.insertNode(root, 14);
        bt.insertNode(root, 3);
        bt.insertNode(root, 6);
        bt.insertNode(root, 7);
        bt.insertNode(root, 1);
        bt.insertNode(root, 4);
        bt.insertNode(root, 13);
        bt.insertNode(root, 12);
		System.out.println("Tree before deletion");
		bt.travserval(root);
		System.out.println();
		bt.deletion(root, 3);
		System.out.println("Tree after deletion");
		bt.travserval(root);
	}

}
