package FileInputStreamTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String file = "D:\\test.txt";
		int temp = 0;
		byte[] bytes = new byte[3];
		FileInputStream f;
		try {
			f = new FileInputStream(file);
			while((temp = f.read()) != -1){
				System.out.println(temp);
			}
			f.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(IOException e){
			e.printStackTrace();
		}
		FileInputStream f1;
		try {
			f1 = new FileInputStream(file);
			while((temp = f1.read(bytes)) != -1){
				System.out.println(new String(bytes,0,temp));
			}
			f1.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
