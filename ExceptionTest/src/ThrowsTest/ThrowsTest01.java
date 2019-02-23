package ThrowsTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsTest01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m2();
	}
	public static void m2(){
		try{
			m1();
		}
		catch(FileNotFoundException e){
			System.out.println("file not found");
		}
	}
	public static void m1() throws FileNotFoundException{
		new FileInputStream("d:/java/1.txt");
	}

}
