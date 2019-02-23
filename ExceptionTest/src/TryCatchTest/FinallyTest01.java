package TryCatchTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FinallyTest01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main -----"+m1());
		FileInputStream f = null ;
		try{
			f = new FileInputStream("D:\\jz\\hm.txt");
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}finally{
			if(f != null){
				try {
					f.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	public static int m1(){
		int i = 10;
		try{
			/*
			 int temp = i;
			 return temp;
			 */
			return i;
		}finally{
			i++;
			System.out.println("finally ---"+i);
		}
	}

}
