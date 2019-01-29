package Polymorphism;

public class Test01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a1 = new Cat();
		a1.move();
//		a1.catchMouse();
		Cat c1 = (Cat)a1;
		c1.catchMouse();
		Animal a2 = new Bird();
		if(a2 instanceof Cat){
			Cat c3 = (Cat)a2;
			c3.catchMouse();
		}else if(a2 instanceof Bird){
			Bird b1 = (Bird)a2;
			b1.fly();
		}
		/**Cat c2 = (Cat)a2;
		 * 程序虽然编译通过了，但是程序在运行阶段会会出现异常，因为jvm堆内存当中真是存在的对象无法转换成对应对象，因为两个类型之间不存在继承关系。
		 */
	}

}
