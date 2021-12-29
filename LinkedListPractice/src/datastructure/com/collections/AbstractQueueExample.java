package datastructure.com.collections;

import java.util.AbstractQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class AbstractQueueExample {
	
	public static void main(String args[]) {
		AbstractQueue<Integer> aq = new LinkedBlockingDeque<Integer>();
		aq.add(1);
		aq.add(2);
		aq.add(3);
		System.out.println(aq);
		System.out.println(aq.remove());
		System.out.println(aq);
		aq.clear();
		System.out.println(aq);
	}

}
