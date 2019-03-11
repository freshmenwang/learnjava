package ShoppingCarTest;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1 = new Product("10001","苹果",3.0);
		Product p2 = new Product("10002","雪梨",4.0);
		Product p3 = new Product("20001","手机",1000.0);
		Product p4 = new Product("20002","电脑",2000.0);
		Product p5 = new Product("30001","上衣",40.0);
		ShoppingCar sc = new ShoppingCar();
		sc.add(p1);
		sc.add(p5,10);
		sc.add(p4);
		sc.add(p3,2);
		sc.add(p2);
		sc.add(p2,2);
		sc.remove(p5,2);
		sc.show();
		sc.clear();
		sc.show();
	}

}
