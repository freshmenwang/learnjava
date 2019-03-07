package Test;

import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String[] strarr = str.split(".");
        int status = 1;
        if(strarr.length ==4){
        	try {
				for(int i = 0;i <strarr.length;i++){        			
					int t = Integer.parseInt(strarr[i]);
					if(t >= 0 && t <= 255 ){
						continue;
					}else{
						status = 0;
						break;
					}
				}
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				System.out.println("No");
			}
        	if(status == 1){
        		System.out.println("YES");
        	}else{
        		System.out.println("NO");
        	}
        }else{
        	System.out.println("NO");
        }
	}

}
