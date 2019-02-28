package OftenUse;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a = "wang".charAt(1);
		System.out.println(a);
		System.out.println("wangjiazhao".endsWith("zhao"));
		System.out.println("abc".equalsIgnoreCase("ABC"));
		byte[] b = "abc".getBytes();
		for(int i = 0; i < b.length; i++){
			System.out.println(b[i]);
		}
		System.out.println("wangjiazhao".indexOf("jia"));
		System.out.println("wangwangjia".indexOf("wang", 2));
		System.out.println("wangwangwang".lastIndexOf("wang"));
		System.out.println("wangwangwang".lastIndexOf("wang", 10));
		System.out.println("wang".length());
		System.out.println("wangjiazhao".replaceAll("zhao", "kun"));
		String[] s = "2019-02-27".split("-");
		for(int i = 0; i < s.length; i++){
			System.out.println(s[i]);
		}
		System.out.println("ancst".startsWith("an"));
		System.out.println("abcde".substring(1));
		System.out.println("12345".substring(1,3));
		char[] c = "abcdefg".toCharArray();
		for(int i = 0; i < c.length; i++){
			System.out.println(c[i]);
		}
		System.out.println("abc".toUpperCase());
		System.out.println("ABC".toLowerCase());
		System.out.println("    abc efg    ".trim()+"abc");
		Object o = null;
		System.out.println(o);
		
	}

}
