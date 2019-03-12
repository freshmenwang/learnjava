package FileTest;

import java.io.File;
import java.io.IOException;

public class OftenUseTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("D:\\logtest.txt");
		System.out.println(f.exists());
		File f1 = new File("D:\\oftenuse\\use");
		f1.mkdirs();
		System.out.println(f1.getAbsolutePath());
		File f2 = new File("D:\\often.txt");
		try {
			f2.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(f2.getName());
		System.out.println(f2.getParent());
		System.out.println(f2.lastModified());
		System.out.println(f2.length());
		
		
	}

}
