package singletontest;

public class SingletonTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton s1 = Singleton.s;
		Singleton s2 = Singleton.getSingleton();
		System.out.println(s1 == s2);
		System.out.println("-----------------");
		Singleton01 s3 = Singleton01.getSingleton01();
		Singleton01 s4 = Singleton01.getSingleton01();
		System.out.println(s3 == s4);
	}

}
