public class OoTest01{
	public static void main(String[] args){
		Student s = new Student();
		People p = new People();
		s.rachel = p;
		p.name = "吴菁菁";
		System.out.println(s.rachel.name);
	}
}