import java.util.*;
public class IfTest{
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
		int userInputContent = reader.nextInt();
		String content = "儿童";
		if(userInputContent < 0 || userInputContent>150){
			content = "您输入的年龄数据不合法" ;
		}else if(userInputContent >= 56){
			content = "老年";
		}else if(userInputContent >= 35){
			content = "中年";
		}else if(userInputContent >= 18){
			content = "青年";
		}else if(userInputContent >=12){
			content = "青少年";
		}else if(userInputContent >=8){
			content = "少儿";
		}
		System.out.println(content);
	}
}