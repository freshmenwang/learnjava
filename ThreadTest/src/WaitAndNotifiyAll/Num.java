package WaitAndNotifiyAll;

public class Num {
	private int num;
	public Num(int num){
		this.num = num;
	}
	public synchronized void showOdd(){
		this.notifyAll();
		System.out.println(++num);
		try {
			this.wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public synchronized void showEven(){
		this.notifyAll();
		System.out.println(++num);
		try {
			this.wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
