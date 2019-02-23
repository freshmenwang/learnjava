package CustomException;

public class CustomerService {
	private  String username;
	public void regsiter(String username) throws IllegalNameException{
		if(username.length() < 6){
			throw new IllegalNameException("用户名不合法");
		}
		this.username = username ;
	}
	public String getUsername(){
		return this.username;
	}
}
