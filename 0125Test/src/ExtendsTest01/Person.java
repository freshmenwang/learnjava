package ExtendsTest01;

public class Person {
	private String name;
	private int age;
	private boolean sex;
	static{
		System.out.println("static run");
	}
	{
		System.out.println("person go");
	}
	public Person(){
		System.out.println("no var");
	}
	public Person(String name, int age, boolean sex) {
		
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isSex() {
		return sex;
	}
	public void setSex(boolean sex) {
		this.sex = sex;
	}
	public void talk(){
		System.out.println("������");
	}
	public static void play(){
		System.out.println("come on");
	}
	

}
