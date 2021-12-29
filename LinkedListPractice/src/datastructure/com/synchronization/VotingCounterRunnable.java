package datastructure.com.synchronization;

public class VotingCounterRunnable implements Runnable {
	
	private int vote = 0;

	public int getVote() {
		return vote;
	}

	public void setVote(int vote) {
		this.vote = vote;
	}
	
	public void run() {
		System.out.println(Thread.currentThread().getName()+" Before increamenting counter --> "+getVote());
		
		synchronized (this) {
			setVote(getVote()+1); //critical section
		}
		
		System.out.println(Thread.currentThread().getName()+" After increamenting counter --> "+getVote());
	}

}
