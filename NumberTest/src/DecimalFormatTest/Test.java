package DecimalFormatTest;

import java.text.DecimalFormat;
import java.text.ParseException;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat df = new DecimalFormat("##,###.00");
		System.out.println(df.format(1234567));
	
		
	}

}
