package HashMapTest;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class BaseTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map m = new HashMap();
		m.put("a",100);
		m.put("b",100);
		m.put("c",100);
		m.put("d",100);
		m.put("e",100);
		Set s = m.keySet();
		Iterator it = s.iterator();
		while(it.hasNext()){
			Object k = it.next();
			Object v = m.get(k);
			System.out.println(k+"-"+v);
		}
		System.out.println(m.containsKey("a"));
		System.out.println(m.containsValue(100));
		System.out.println(m.size());
		System.out.println(m.isEmpty());
		Collection c = m.values();
		Iterator it1 = c.iterator();
		while(it1.hasNext()){
			System.out.println(it1.next());
		}
		Set s1 = m.entrySet();
		Iterator it2 = s1.iterator();
		while(it2.hasNext()){
			System.out.println(it2.next());
		}
		m.remove("a");
		System.out.println(m.size());
	}

}
