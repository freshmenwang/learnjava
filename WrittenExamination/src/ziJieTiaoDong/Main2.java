package ziJieTiaoDong;

import java.util.Scanner;

public class Main2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] result = new int[n];
		for(int i = 0;i < n;i++){
			int n1 = in.nextInt();
			int[] arr = new int[n1];
			for(int j = 0;j < n1;j++){
				arr[j] = in.nextInt();
			}
			result[i] = f(arr);
		}
		for(int i = 0;i < n;i++){
			System.out.println(result[i]);
		}
	}
	public static int f(int[] arr){
		int[] num = new int[arr.length];
		int t = 1;
		int sum = 0;
		for(int i = 0;i < arr.length;i++){
			if(i == 0){
				num[i] = 1;
			}else{
				if(arr[i] > arr[i - 1]){
					num[i] = num[i - 1] + 1;
					t = 1;
				}else if(arr[i] == arr[i - 1]){
					num[i] = 1;
					t++;
				}else{
					if(num[i - 1] == 1){
						for(int j = 1;j <= t;j++){
							num[i - j]++;
						}
					}
					t++;
					num[i] = 1;
				}
			}
		}
		if(arr[0] > arr[arr.length - 1]){
			if(num[0] < num[arr.length - 1]){
				num[0] = num[arr.length -1] + 1;
			}
			
		}else if(arr[0] == arr[arr.length - 1]){
			num[0] = 1;
			t++;
		}else{
			if(num[arr.length -1] == 1){
				for(int j = 1;j <= t;j++){
					num[arr.length -1 - j]++;
				}
			}
			t++;
			num[0] = 1;
		}
		for(int i = 0;i < num.length;i++){
			sum += num[i];
		}
		return sum;
	}

}
