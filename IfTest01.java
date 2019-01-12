import java.util.*;
public class IfTest01{
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
		System.out.println("请输入当前天气");
		String weather = reader.next();
		if(weather.equals("下雨")){
			System.out.println("请输入性别");
			String sex = reader.next();
			if(sex.equals("男")){
				System.out.println("带一把大黑伞");
			}else if(sex.equals("女")){
				System.out.println("带一把小花伞");
			}
		}else if(weather.equals("晴天")){
			System.out.println("请输入当前温度");
			double temperature = reader.nextInt();
			if(temperature >= 30){
				System.out.println("请输入性别");
				String sex = reader.next();
				if(sex.equals("男")){
					System.out.println("戴墨镜");
				}else if(sex.equals("女")){
					System.out.println("抹防晒霜");
				}
			}
		}
	}
}