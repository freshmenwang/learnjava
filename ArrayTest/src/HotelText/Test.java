package HotelText;

import java.util.Scanner;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("初始化酒店，默认输入1，自定义输入2");
		int t = s.nextInt();
		Hotel h;
		if(t == 1){
			h = new Hotel();
		}else{
			System.out.println("请输入酒店层数");
			int rows = s.nextInt();
			System.out.println("请输入每层的户数");
			int cols = s.nextInt();
			h = new Hotel(rows,cols);
		}
		while(true){
			System.out.println("请选择您要办理的业务：开房1，退房2,显示房间列表3");
			t = s.nextInt();
			if(t == 1){
				System.out.println("请输入您要什么样的房间");
				String type = s.next();
				h.put(type);
			}else if(t == 2){
				System.out.println("请输入您要退的房间号");
				String num = s.next();
				h.out(num);
			}else{
				h.show();
			}
		}
	}

}
