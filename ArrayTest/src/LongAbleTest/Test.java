package LongAbleTest;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1(1,2,3,4);
		m1(5);
		int[] a = {1,2,3,4};
		m1("wjz",a);
	}
	public static void m1(int...numble){
		for(int i : numble){
			System.out.println(i);
		}
	}
	public static void m1(int numble){
		System.out.println(numble+1);
	}
	public static void m1(String name,int...numble){
		for(int i : numble){
			System.out.println(name+"----"+i);;
		}
	}
}
