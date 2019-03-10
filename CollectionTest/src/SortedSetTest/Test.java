package SortedSetTest;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set s = new TreeSet();
		s.add(100);
		s.add(90);
		s.add(80);
		Iterator it = s.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		Set s1 = new TreeSet(new PriceComparator());
		Price p1 = new Price(100);
		Price p2 = new Price(400);
		Price p3 = new Price(300);
		Price p4 = new Price(300);
		s1.add(p1);
		s1.add(p4);
		s1.add(p3);
		s1.add(p2);
		it = s1.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		Set s2 = new TreeSet();
		Price01 p01 = new Price01(100);
		Price01 p02 = new Price01(400);
		Price01 p03 = new Price01(200);
		Price01 p04 = new Price01(300);
		s2.add(p01);
		s2.add(p04);
		s2.add(p03);
		s2.add(p02);
		it = s2.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
	}

}
