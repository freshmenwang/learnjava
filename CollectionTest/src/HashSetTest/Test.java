package HashSetTest;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set s = new HashSet();
		Price p1 = new Price(100,"apple");
		Price p2 = new Price(100,"banana");
		s.add(p1);
		s.add(p2);
		s.add(100);
		System.out.println(s.size());
		Iterator it = s.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
	}

}
