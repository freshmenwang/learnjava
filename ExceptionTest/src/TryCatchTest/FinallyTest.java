package TryCatchTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FinallyTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		try{
			System.exit(0);
			FileInputStream f = new FileInputStream("123.txt");
		}finally{
			System.out.println("finally run");
		}
	}

}
