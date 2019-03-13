package SynchronizedTest;

public class Processor implements Runnable {

	Account a;
	
	public Processor(Account a) {
		this.a = a;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		a.takemoney(100.0);
		
	}

}
