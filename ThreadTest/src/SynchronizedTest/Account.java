package SynchronizedTest;

public class Account {
	private String name;
	private double balance;
	public Account(String name, double balance) {
		super();
		this.name = name;
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void takemoney(double money){
		synchronized(this){
			this.setBalance(getBalance()-money);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(name+"��ȡ��"+money+"��ʣ"+getBalance());
		}
	}
	public synchronized static void m1(){
		System.out.println("m1 running");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("m1 ending");
	}
	public synchronized static void m2(){
		System.out.println("m2 running");
	}
	
}
