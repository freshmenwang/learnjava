package ExtendsTest01;

public class ExtendsTest01{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student("���꼶","��ʮ��С");
		s.setAge(10);
		Student n = new Student();
		System.out.println(s.getAge()+n.getSchool()+n.getGrade());
		s.talk();
	}

}