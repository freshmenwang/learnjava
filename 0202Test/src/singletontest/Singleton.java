package singletontest;
/**
 * ����ʽ����
*/
public class Singleton {
	static Singleton s = new Singleton();
	private Singleton(){
	}
	public static Singleton getSingleton(){
		return s;
	}
	
}
