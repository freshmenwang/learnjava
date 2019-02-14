package JubuInner;

public class Outer {

	/**
	 * @param args
	 */
	public void m1(){
		final int o =10;
		class Inner{
			void m2(){
				System.out.println(o);
			}
		}
		Inner i = new Inner();
		i.m2();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer o = new Outer();
		o.m1();
	}

}
