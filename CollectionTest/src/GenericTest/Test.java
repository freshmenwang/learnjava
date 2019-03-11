package GenericTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l = new ArrayList<Integer>();
		l.add(100);
		l.add(2000);
		l.add(20);
		for(Integer i : l){
			System.out.println(i);
		}
		Map<String,Integer> m = new HashMap<String,Integer>();
		m.put("Mike",20);
		Set<String> set = m.keySet();
		for(String s : set){
			System.out.println(m.get(s));
		}
		Set<Person> persons = new TreeSet<Person>();
		Person p1 = new Person("Mike",10);
		Person p2 = new Person("Amy",20);
		Person p3 = new Person("Tom",30);
		Person p4 = new Person("Chris",15);
		persons.add(p1);
		persons.add(p2);
		persons.add(p3);
		persons.add(p4);
		for(Person p : persons){
			System.out.println(p);
		}
		
	}

}
