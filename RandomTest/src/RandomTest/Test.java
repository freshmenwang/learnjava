package RandomTest;

import java.util.Random;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[5];
		int numble = 0;
		int status;
		while(numble < 5){
			status = 0;
			int t = new Random().nextInt(5);
			for(int i = 0;i < numble;i++){
				if(t == array[i]){
					status = 1;
					break;
				}
			}
			if(status == 0){
				array[numble++] = t;
			}
			
		}
		for(int i =0;i < array.length;i++){
			System.out.println(array[i]);
		}
	}

}
