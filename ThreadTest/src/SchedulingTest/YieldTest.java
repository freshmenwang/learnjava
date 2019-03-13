package SchedulingTest;

public class YieldTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = new Thread(new Processeryield());
		t.setName("yield");
		t.start();
		Thread tm = Thread.currentThread();
		tm.setName("main");
		for(int i = 0;i < 100;i++){
			System.out.println(tm.getName()+"--->"+i);
		}
	}

}
