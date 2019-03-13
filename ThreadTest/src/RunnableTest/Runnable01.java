package RunnableTest;

public class Runnable01 implements Runnable {

	@Override
	public void run() {
		Thread t = Thread.currentThread();
		t.setName("Runnabletest");
		// TODO Auto-generated method stub
		for(int i = 0;i < 100;i++){
			System.out.println(t.getName()+"----->"+i);
		}
	}

}
