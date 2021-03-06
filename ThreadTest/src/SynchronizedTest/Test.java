package SynchronizedTest;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a = new Account("account001",5000);
		Account a1 = new Account("abc",1000);
		Account a2 = new Account("abcd",1000);
		Thread t1 = new Thread(new Processor(a));
		Thread t2 = new Thread(new Processor(a));
		Thread t3 = new Thread(new ClassProcessor());
		Thread t4 = new Thread(new ClassProcessor());
		Thread dead1 = new Thread(new Deadlock(a1,a2));
		Thread dead2 = new Thread(new Deadlock(a1,a2));
		dead1.setName("deadlock1");
		dead1.start();
		dead2.start();
		t3.setName("t3");
		t3.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		t4.start();
		t1.start();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
	}

}
