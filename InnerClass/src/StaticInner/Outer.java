package StaticInner;

public class Outer {
	
	private static String s = "abc" ;
	
	private static void m1(){
		System.out.println("outer m1 running");
	}
	private void m2(){
		System.out.println("outer m2 running");
	}
	/**
	 * @param args
	 */
	static class Inner{
		static void m3(){
			m1();
		}
		void m4(){
			Outer o = new Outer();
			o.m2();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer.Inner.m3();
		Inner i = new Outer.Inner();
		i.m4();
	}

}
