package CollectionsTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l = new ArrayList();
		l.add(100);
		l.add(10);
		l.add(9);
		l.add(20);
		Collections.sort(l);
		Iterator it = l.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
