package singletontest;
/**
 * ��������
*/
public class Singleton01 {
	private static Singleton01 s = null;
	private Singleton01(){
	}
	public static Singleton01 getSingleton01(){
		if(s == null){
			s = new Singleton01();
		}
		return s;
	}
}
