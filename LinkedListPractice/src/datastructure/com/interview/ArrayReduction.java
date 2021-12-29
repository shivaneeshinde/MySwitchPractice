package datastructure.com.interview;

import java.util.Arrays;
import java.util.PriorityQueue;

public class ArrayReduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] A = {1,2,3};
		int output[] = new int[2];
		output = sumAndCost(A);
		System.out.println("sum is: "+output[0]);
		System.out.println("cost is: "+output[1]);
	}
	
	 public static int[] sumAndCost(Integer[] arr) {
	        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Arrays.asList(arr));
	        int sum = priorityQueue.poll();
	        int cost = 0;
	        while (!priorityQueue.isEmpty()) {
	            int currentElement = priorityQueue.poll();
	            if (currentElement < sum) {
	                priorityQueue.add(sum);
	                sum = currentElement;
	            } else {
	                sum += currentElement;
	                cost += sum;
	                continue;
	            }

	            sum += priorityQueue.poll();
	            cost += sum;
	        }

	        return new int[] {sum, cost};
	    }

}
