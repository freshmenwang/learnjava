package WaitAndNotifiyAll;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Num n = new Num(0);
		Thread t1 = new Thread(new Processor(n));
		t1.setName("t1");
		Thread t2 = new Thread(new Processor1(n));
		t2.setName("t2");
		t1.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
	}

}
