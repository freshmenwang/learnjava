package ListTest;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l = new ArrayList();
		l.add(100);
		l.add(300);
		l.add(400);
		l.add(1,200);
		for(int i = 0;i < l.size();i++){
			Object o = l.get(i);
			System.out.println(o);
		}
	}

}
