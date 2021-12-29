package datastructure.com.collections;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentLinkedQueueDemo {
	
    public static void main(String[] args)
    {
  
        // Create a ConcurrentLinkedQueue
        // using ConcurrentLinkedQueue() 
          // constructor
        ConcurrentLinkedQueue<Integer>
            clq = new ConcurrentLinkedQueue<Integer>();
  
        clq.add(12);
        clq.add(70);
        clq.add(1009);
        clq.add(475);
  
        // Displaying the existing ConcurrentLinkedQueue
        System.out.println("ConcurrentLinkedQueue: "
                           + clq);
  
        // Displaying the first element
        // using peek() method
        System.out.println("First Element is: "
                           + clq.peek());
  
        // Remove and display the first element
        // using poll() method
        System.out.println("Head Element is: "
                           + clq.poll());
  
        // Displaying the existing ConcurrentLinkedQueue
        System.out.println("ConcurrentLinkedQueue: "
                           + clq);
  
        // Get the size using size() method
        System.out.println("Size: "
                           + clq.size());  

        // Call iterator() method
        Iterator iterator = clq.iterator();
  
        // Print elements of iterator
        System.out.println("\nThe String Values of iterator are:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
