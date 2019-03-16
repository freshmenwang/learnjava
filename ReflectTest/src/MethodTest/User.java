package MethodTest;

public class User {
	public  boolean login(String name,String password){
		if("wjz".equals(name) && "123".equals(password)){
			return true;
		}
		return false;
	} 
}
