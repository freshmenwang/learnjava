package ziJieTiaoDong;

import java.util.Scanner;

public class Main1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String[] str = new String[n];
		for(int i = 0;i < n;i++){
			str[i] = in.next();
		}
		for(int i = 0;i < n;i++){
			char[] c = str[i].toCharArray();
			int[] ci = new int[c.length];
			int t1 = 0;
			int t2 = 0;
			int t3 = 0;
			char ex = 'a';
			for(int j = 0;j < c.length;j++){
				if(j == 0){
					t1 = 1;
					ex = c[j];
				}else{
					if(c[j] == ex){
						if(t1 == 2){
							ci[j] = 1;
						}else{
							if(t2 == 1){
								ci[j] = 1;
							}else{
								t2 = 1;
								t1 = 2;
								t3 = 2;
							}
						}
					}else{
						if(t3 != 0){
							t3--;
							if(t3 == 0){
								t2 = 0;
							}
						}
						ex = c[j];
						t1 = 1;
					}
				}
			}
			StringBuffer s = new StringBuffer();
			for(int j = 0;j < c.length;j++){
				if(ci[j] == 0){
					s.append(c[j]);
				}
			}
			System.out.println(s);
		}
		
		
	}

}
