public class OperatorTest01{
	public static void main(String[] args){
		int x=10,s=10;
		System.out.println(x > 2 | x++ < 12);
		System.out.println(s > 2 || s++ < 12 );
		System.out.println(x+"  "+s);
	}
}