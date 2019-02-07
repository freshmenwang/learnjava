package AbstractAndInteface;

public class Apple implements Color, Fruit {

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("是红色的");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("大口吃");
	}

}
