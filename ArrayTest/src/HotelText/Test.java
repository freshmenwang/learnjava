package HotelText;

import java.util.Scanner;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("��ʼ���Ƶ꣬Ĭ������1���Զ�������2");
		int t = s.nextInt();
		Hotel h;
		if(t == 1){
			h = new Hotel();
		}else{
			System.out.println("������Ƶ����");
			int rows = s.nextInt();
			System.out.println("������ÿ��Ļ���");
			int cols = s.nextInt();
			h = new Hotel(rows,cols);
		}
		while(true){
			System.out.println("��ѡ����Ҫ������ҵ�񣺿���1���˷�2,��ʾ�����б�3");
			t = s.nextInt();
			if(t == 1){
				System.out.println("��������Ҫʲô���ķ���");
				String type = s.next();
				h.put(type);
			}else if(t == 2){
				System.out.println("��������Ҫ�˵ķ����");
				String num = s.next();
				h.out(num);
			}else{
				h.show();
			}
		}
	}

}