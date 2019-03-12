package FileTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("D:\\jz");
		copy(f);
	}
	public static void copy(File f){
		if(f.isFile()){
			File fd = new File("D:/newjz" + f.getParent().replaceAll("//", "/").substring(5));
			File f1 = new File("D:/newjz" + f.getAbsolutePath().replaceAll("//", "/").substring(5));	
			if(!fd.isDirectory()){
				fd.mkdirs();
			}
			try {
				f1.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			int temp = 0;
			byte[] bytes = new byte[1024];
			try {
				FileInputStream in = new FileInputStream(f);
				FileOutputStream out = new FileOutputStream(f1);
				while((temp = in.read(bytes)) != -1){
					out.write(bytes);
				}
				in.close();
				out.flush();
				out.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return;
		}
		File[] fs = f.listFiles();
		for(File fi : fs){
			copy(fi);
		}
	}

}
