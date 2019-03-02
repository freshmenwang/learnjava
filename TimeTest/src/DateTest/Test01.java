package DateTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyƒÍMM‘¬dd»’");
		System.out.println(sdf.format(now));
		String date = "2008-10-10";
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		try {
			now = sdf1.parse(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(now);
	}

}
