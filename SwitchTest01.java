import java.util.*;
public class SwitchTest01{
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
		System.out.println("欢迎使用简单计算器系统");
		System.out.println("请输入第一个数字");
		int number1 = reader.nextInt();
		System.out.println("请输入一个运算符");
		String operator = reader.next();
		System.out.println("请输入第二个数字");
		int number2 = reader.nextInt();
		int finalNumber = 0;
		int status = 0;
		switch(operator){
			case "+" :
				finalNumber = number1 + number2;
				break;
			case "-" :
				finalNumber = number1 - number2;
				break;
			case "*" :
				finalNumber = number1 * number2;
				break;
			case "/" :
				finalNumber = number1 / number2;
				break;
			default :
				System.out.println("输入的运算符不合法");
				status = 1;
		}
		if(status == 0){
			System.out.println(number1+operator+number2+"="+finalNumber);
		}
	}
}