package ChengyuanInner;

public class Outer {

	/**
	 * @param args
	 */
	private static void m1(){
		System.out.println("m1 running");
	}
	private void m2(){
		System.out.println("m2 running");
	}
	class Inner{
		public void m3(){
			m1();
			m2();
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer o = new Outer();
		Inner i = o.new Inner();
		i.m3();
	}

}
