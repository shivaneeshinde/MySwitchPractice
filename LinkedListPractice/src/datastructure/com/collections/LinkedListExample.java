package datastructure.com.collections;

import java.util.LinkedList;

public class LinkedListExample {
	

    public static void main(String args[])
    {
        // Creating object of the
        // class linked list
        LinkedList<String> ll
            = new LinkedList<String>();
  
        // Adding elements to the linked list
        ll.add("A");
        ll.add("B");
        ll.addLast("C");
        ll.addFirst("D");
        ll.add(2, "E");
  
        System.out.println(ll);
        
        ll.set(1, "For"); 
        System.out.println(ll);
        
        for (int i = 0; i < ll.size(); i++) { 
            
            System.out.print(ll.get(i) + " "); 
        } 
    
        System.out.println(); 
    
        // Using the for each loop 
        for (String str : ll) 
            System.out.print(str + " "); 

        System.out.println(); 
  
        ll.remove("B");
        ll.remove(3);
        ll.removeFirst();
        ll.removeLast();
  
        System.out.println(ll);
    }

}
