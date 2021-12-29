package datastructure.com.synchronization;

public class SynchronizedBlockMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		VotingCounterRunnable votingCounterRunnable = new VotingCounterRunnable();
		
		Thread state1 = new Thread(votingCounterRunnable,"State1");
		Thread state2 = new Thread(votingCounterRunnable,"State2");
		Thread state3 = new Thread(votingCounterRunnable,"State3");
		Thread state4 = new Thread(votingCounterRunnable,"State4");
		Thread state5 = new Thread(votingCounterRunnable,"State5");
		state1.start();
		state2.start();
		state3.start();
		state4.start();
		state5.start();

	}

}
