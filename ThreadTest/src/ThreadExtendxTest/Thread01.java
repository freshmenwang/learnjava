package ThreadExtendxTest;

public class Thread01 extends Thread {
	public void run(){
		for(int i = 0;i < 100;i++){
			System.out.println("run----->"+i);
		}
	}
}
