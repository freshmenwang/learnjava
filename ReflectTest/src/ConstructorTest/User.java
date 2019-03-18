package ConstructorTest;

public class User {
	private String name;
	private int age;
	public User(){
		age = 10;
		name = "wjz";
		System.out.println(name  + age);
	}
	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		System.out.println(name  + age);
	}
	
}
