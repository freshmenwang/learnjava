package StringAddress;

public class StringAddressTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "wjz";
		String s1 = "wjz";
		String s2 = new String("wjz");
		String s3 = new String("wjz");
		System.out.println(s == s1);
		System.out.println(s2 == s3);
		System.out.println(s == s2);
	}

}
