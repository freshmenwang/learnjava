package ObjectTest;

import java.io.Serializable;

public class User implements Serializable {
	static final long serialVersionUID = 123123123123L;
	transient String name;
	public User(String name){
		this.name =name;
	}
	public String toString(){
		return name;
	}
}
