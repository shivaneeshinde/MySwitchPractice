package datastructure.com.tree;

public class BSTsearchKey {
	
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
	
	public void insert(Node rt, int val) {
		if(rt.data > val) {
			if(rt.left == null) {
				rt.left = new Node(val);
			}
			else {
				insert(rt.left, val);
			}
		}
		else if(rt.data < val) {
			if(rt.right == null) {
				rt.right = new Node(val);
			}
			else {
				insert(rt.right, val);
			}
		}
	}
	
	public void inOrderTraversal(Node rt) {
		if(rt != null) {
			inOrderTraversal(rt.left);
			System.out.print(rt.data+" ");
			inOrderTraversal(rt.right);
		}
	}
	
	public boolean search(Node rt, int key) {		
		if(rt != null) {
			if(rt.data == key) {
				return true;
			}
			else if(rt.data < key) {
				return search(rt.right, key);
			}
			else if(rt.data > key) {
				return search(rt.left, key);
			}
		}		
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(6);
		BSTsearchKey bt = new BSTsearchKey();
		bt.insert(root, 4);
		bt.insert(root, 7);
		bt.insert(root, 10);
		bt.insert(root, 1);
		bt.insert(root, 9);
		bt.insert(root, 3);
		
		Node rt = root;
		
		bt.inOrderTraversal(rt);
		System.out.println();
		
		boolean flag = bt.search(root, 4);
		if(flag) {
			System.out.println("Key found");
		}		
		else {
			System.out.println("key not found");
		}
			
	}

}
