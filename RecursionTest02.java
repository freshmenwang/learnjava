import java.util.*;
public class RecursionTest02{
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
		int number = reader.nextInt();
		System.out.println(result(number));
	}
	public static int result(int num){
		if(num == 1){
			return 1;
		}
		return num*result(num - 1);
	}
}