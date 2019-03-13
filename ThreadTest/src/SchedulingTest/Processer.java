package SchedulingTest;

public class Processer implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0;i < 10;i++){
			try {
				Thread.sleep(1000L);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				
			}
			System.out.println(Thread.currentThread().getName()+"---->"+i);
		}
	}

}
