package WaitAndNotifiyAll;

public class Processor1 implements Runnable {
	Num num;
	public Processor1(Num num){
		this.num = num;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			System.out.println(Thread.currentThread().getName());
			num.showEven();
		}
	}

}
