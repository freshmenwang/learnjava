package GenericTest;

public class Person implements Comparable<Person>{
	String name;
	int age;
	public Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	@Override
	public int compareTo(Person p) {
		// TODO Auto-generated method stub
		if(this.age > p.age){
			return 1;
		}else if(this.age < p.age){
			return -1;
		}
		return 0;
	}
	@Override
	public String toString(){
		return name+age;
	}
}
