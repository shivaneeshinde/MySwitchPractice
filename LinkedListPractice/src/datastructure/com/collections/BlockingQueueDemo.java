package datastructure.com.collections;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueDemo extends Thread {
	
	BlockingQueue<Integer> qu = new ArrayBlockingQueue<Integer>(15);
	
	public void add(int data) {
		synchronized (this) {
			if(qu.size()==5) {
				try {
					wait();
				}
				catch(Exception e) {
					System.out.println("Exception occured");
				}
			}
			else {
				qu.add(data);
				notify();
			}
		}	
	}
	
	public void read() {
		if(qu.size()==5) {
			try {
				wait();
			}
			catch(Exception e) {
				System.out.println("Exception occured while reading");
			}
		}
		else {
			for(Integer i: qu) {
				System.out.print(i+" ");
			}
			notify();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		BlockingQueueDemo d = new BlockingQueueDemo();
		
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				d.add(1);
			}
		});
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				d.read();
			}
		});
		t1.start();
		t2.start();

	}

}
