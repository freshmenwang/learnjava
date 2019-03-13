package SchedulingTest;

public class JoinTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = new Thread(new Processer());
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i = 0;i < 100;i++){
			System.out.println(Thread.currentThread().getName()+"--->"+i);
		}
	}

}
