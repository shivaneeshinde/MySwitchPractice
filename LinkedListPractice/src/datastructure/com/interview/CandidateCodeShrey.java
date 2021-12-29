package datastructure.com.interview;

/* Read input from STDIN. Print your output to STDOUT*/

import java.io.*;
import java.util.*;
public class CandidateCodeShrey {
   public static void main(String args[] ) throws Exception {

	//Write code here
   Scanner sc = new Scanner(System.in);
   int count = sc.nextInt();
   int[] roll = new int[count];
   HashMap<Integer,Integer> map = new HashMap<>();
   String str="";
   int temp = 0;

   for(int i=0; i<count; i++){
      roll[i] = sc.nextInt();
      if(!map.containsKey(roll[i])){
         map.put(roll[i], i+1);
      }
   }
   for(int i=1;i<=count;i++){
      if(!map.containsKey(i)){
         str+= i+" ";
      }
   }
   System.out.println(str.trim());

   }
}
