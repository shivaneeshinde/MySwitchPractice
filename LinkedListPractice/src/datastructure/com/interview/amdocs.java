package datastructure.com.interview;

public class amdocs {

	public Node rotateList(Node head, int n) {
	    Node temp = head;
	    int count = 0;
	    while(temp!=null){
	        count++;
	        temp = temp.getNext();
	    }
	    int index = count - n;
	    System.out.println("index is: "+index);
	    temp = head;
	    int tempCount = 1;
	    Node newNode=null;
	    while(tempCount < index){
	        temp = temp.getNext();
	        tempCount++;
	    }
	    while(temp!=null){
	        if(newNode == null){
	            newNode = temp;
	        }
	        else{
	            Node iterator = newNode;
	            while(iterator.getNext()!=null){
	                iterator = iterator.getNext();
	                break;
	            }
	            iterator.setNext(temp);
	        }	        
	        temp = temp.getNext();
	    }
	    int fCount = 0;
	    while(fCount <= index){
	        newNode.setNext(head);	        
	        fCount++;
	        head = head.getNext();
	    }
	    Node print = newNode;
	    while(print!=null){
	        System.out.println(print.getName());
	        print = print.getNext();
	    }	    
		return newNode;
	}
	
}

class Node{
	
	private String name;
	private Node next;
			
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
}
