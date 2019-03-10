package HashSetTest;

public class Price {

	int money;
	String name;
	public Price(int money,String name){
		this.money = money;
		this.name = name;
	}
	public boolean equals(Object o){
		if(o instanceof Price){
			if(this.money == ((Price)o).money){
				return true;
			}
		}
		return false;
	}
	public String toString(){
		return name+money;
	}
	public int hashCode(){
		return new Integer(money).hashCode();
	}

}
