package ExtendsTest01;

public class ExtendsTest01{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student("三年级","二十五小");
		s.setAge(10);
		Student n = new Student();
		System.out.println(s.getAge()+n.getSchool()+n.getGrade());
		s.talk();
		Student.play();
		Student s1 = new Student();
		
	}

}
