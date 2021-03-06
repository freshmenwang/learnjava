package ShoppingCarTest;

public class Product {
	private String no;
	private String name;
	private double price;
	public Product(String no,String name,double price){
		this.no = no;
		this.name = name;
		this.price = price;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int hashCode(){
		return no.hashCode();
	}
	public boolean equals(Product p){
		if(p.no.equals(this.no)){
			return true;
		}else{
			return false;
		}
	}
}
