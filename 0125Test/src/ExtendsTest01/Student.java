package ExtendsTest01;

public class Student extends Person{
	private String grade;
	private String school;
	static{
		System.out.println("student static run");
	}
	{
		System.out.println("student go");
	}
	public Student(){
		this("һ�꼶","��ʮ��С");
		System.out.println("s run");
	}
	public Student(String grade, String school) {
		
		this.grade = grade;
		this.school = school;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	@Override
	public void talk() {
		System.out.println("����ѧ��");
	}
	
}
