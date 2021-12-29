package datastructure.com.interview;

import java.io.*;
import java.util.*;
public class CandidateCode {
   public static void main(String args[] ) throws Exception {

	//Write code here
   Scanner sc = new Scanner(System.in);
   int count = sc.nextInt();
   int[] roll = new int[count];
   Set<Integer> set = new HashSet<Integer>();
   for(int i=0; i<count; i++){
      roll[i] = sc.nextInt();
      set.add(roll[i]);
   }

   Iterator<Integer> it = set.iterator();
   int prev = it.next();
   if(prev != 1) {
	   prev = 1;
	   System.out.print(prev+" ");
   }
   System.out.println("first element is: "+prev);
   while(it.hasNext()) {
      int curr = it.next();
      System.out.println("inside while element is: "+curr);
      if(curr - prev > 1)
      {
         for(int i = prev+1;i<curr; i++)
            System.out.print(i+" ");
      }        
      prev = curr;
   }
   System.out.println();
   System.out.println("first element is: "+prev);
   if(set.size() < count){
      for(int i=prev+1; i<=count; i++)
         System.out.print(i+" ");
   }

   }
}
