package JavaTest20190120;

public class Constructor {
	private int age;
	private String name;
	public Constructor(int _age , String _name){
		age = _age;
		name = _name;
		System.out.println("running");
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
