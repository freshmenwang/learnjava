package WaitAndNotifiyAll;

public class Processor implements Runnable {
	Num num;
	public Processor(Num num){
		this.num = num;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			System.out.println(Thread.currentThread().getName());
			num.showOdd();
		}
	}

}
