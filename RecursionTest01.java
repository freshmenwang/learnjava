import java.util.*;
public class RecursionTest01{
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
		int number = reader.nextInt();
		int sum = getSum(number);
		System.out.println(sum);
	}
	public static int getSum(int num){
		if(num == 0){
			return num;
		}
		return num + getSum(num - 1);
	}
}