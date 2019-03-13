package SchedulingTest;

public class Processeryield implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0;i < 100;i++){
			if(i % 20 == 0){
				Thread.yield();
			}
			System.out.println(Thread.currentThread().getName()+"---->"+i);
		}
	}

}
