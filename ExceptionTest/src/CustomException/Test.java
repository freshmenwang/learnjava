package CustomException;

import java.util.Scanner;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerService c = new CustomerService();
		Scanner s = new Scanner(System.in);
		try {
			c.regsiter(s.nextLine());
			System.out.println(c.getUsername());
		} catch (IllegalNameException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

}
