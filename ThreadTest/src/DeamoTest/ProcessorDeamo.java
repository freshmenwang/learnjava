package DeamoTest;

public class ProcessorDeamo implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i = 0;
		while(true){
			i++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"--->"+i);
		}
	}

}
