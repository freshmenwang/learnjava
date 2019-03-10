package SortedSetTest;

public class Price01 implements Comparable<Object> {

	int money;
	
	public Price01(int money) {
		this.money = money;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		if(o instanceof Price01){
			if(((Price01)o).money < money){
				return 1;
			}else if(((Price01)o).money > money){
				return -1;
			}
		}
		return 0;
	}
	public String toString(){
		return "money"+money;
	}
	
}
