package CustomException;

public class CustomerService {
	private  String username;
	public void regsiter(String username) throws IllegalNameException{
		if(username.length() < 6){
			throw new IllegalNameException("�û������Ϸ�");
		}
		this.username = username ;
	}
	public String getUsername(){
		return this.username;
	}
}
