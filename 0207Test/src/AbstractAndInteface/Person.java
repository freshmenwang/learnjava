package AbstractAndInteface;

public abstract class Person {
	private String country ;
	public abstract void talk();
	public void run(){
		System.out.println("running");
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
}
