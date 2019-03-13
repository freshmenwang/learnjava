package ThreadExtendxTest;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread01 t1 = new Thread01();
		t1.start();
		for(int i = 0;i < 100;i++){
			System.out.println("main----->"+i);
		}
	}

}
