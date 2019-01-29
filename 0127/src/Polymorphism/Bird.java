package Polymorphism;

public class Bird extends Animal {

	@Override
	public void move() {
		System.out.println("鸟儿在飞");
	}
	public void fly(){
		System.out.println("鸟儿飞起来了");
	}
	
}
