package ThisTest01;

public class ThisTest {
	int t = 10;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisTest tt = new ThisTest();
		System.out.println(tt.t);
		tt.run();
		doSome();
	}
	public static void doSome(){
		System.out.println("do some");
	}
	public void doOther(){
		System.out.println("do other");
	}
	public void run(){
		doSome();
		doOther();
	}
	

}
