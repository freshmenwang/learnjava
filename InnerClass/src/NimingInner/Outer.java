package NimingInner;

public class Outer {

	/**
	 * @param args
	 */
	public static void m1(CustomerService c){
		c.logout();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1(new CustomerService(){
			public void logout(){
				System.out.println("已经退出系统");
			}
		});
	}

}
