package SynchronizedTest;

public class ClassProcessor implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		if(Thread.currentThread().getName().equals("t3")){
			Account.m1();
		}else{
			Account.m2();
		}
	}

}
