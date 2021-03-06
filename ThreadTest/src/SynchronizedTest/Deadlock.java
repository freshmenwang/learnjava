package SynchronizedTest;

public class Deadlock implements Runnable {

	Account a1;
	Account a2;
	
	public Deadlock(Account a1, Account a2) {
		super();
		this.a1 = a1;
		this.a2 = a2;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Account a3;
		Account a4;
		if(Thread.currentThread().getName().equals("deadlock1")){
			a3 = a1;
			a4 = a2;
		}else{
			a3 = a2;
			a4 = a1;
		}
		synchronized(a3){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			synchronized(a4){
				System.out.println("两个都拿到了");
			}
		}
	}

}
