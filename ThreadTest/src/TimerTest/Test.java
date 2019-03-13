package TimerTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Timer;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Timer t = new Timer();
		try {
			t.schedule(new TimetaskDemo(), new SimpleDateFormat("yyyy-MM-dd-hh-mm").parse("2019-03-13-17-01"), 5*1000);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
