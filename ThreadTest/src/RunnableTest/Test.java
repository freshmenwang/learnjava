package RunnableTest;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = new Thread(new Runnable01());
		t.setPriority(Thread.MIN_PRIORITY);
		t.start();
		Thread tm = Thread.currentThread();
		tm.setPriority(Thread.MAX_PRIORITY);
		for(int i = 0;i < 100;i++){
			System.out.println(tm.getName()+"----->"+i);
		}
	}

}
