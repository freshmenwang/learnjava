package CollectionBaseTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection c = new ArrayList();
		c.add(new Object());
		c.add(12);
		c.add("Collection");
		System.out.println(c.size());
		System.out.println(c.isEmpty());
		Object[] o = c.toArray();
		for(int i = 0;i < o.length;i++){
			System.out.println(o[i]);
		}
		Object a;
		Iterator itr = c.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		c.clear();
		System.out.println(c.size());
	}

}
