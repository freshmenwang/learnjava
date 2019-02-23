package TryCatchTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryCatchTest01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream f;
		try {
			f = new FileInputStream("D:/java/1.txt");
			f.read();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			System.out.println("file not found 111");
		} catch (IOException e){
			System.out.println("ioexception");
		}
	}

}
