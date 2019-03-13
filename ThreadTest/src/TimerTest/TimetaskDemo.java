package TimerTest;

import java.util.TimerTask;

public class TimetaskDemo extends TimerTask {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0;i < 5;i++){
			System.out.println(i);
		}
	}

}
