package ziJieTiaoDong;

import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = 1024 - n;
		int sum = 0;
		if(m / 64 > 0 ){
			sum += m / 64;
			m = m % 64;
			if(m / 16 > 0){
				sum += m / 16;
				m = m % 16;
				if(m / 4 > 0){
					sum += m / 4;
					m = m % 4;
					if(m > 0){
						sum += m;
						System.out.println(sum);
					}else{
						System.out.println(sum);
					}
				}else{
					System.out.println(sum);
				}
			}else{
				System.out.println(sum);
			}
		}else{
			System.out.println(sum);
		}
	}

}
