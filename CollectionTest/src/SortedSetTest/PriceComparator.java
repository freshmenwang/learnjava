package SortedSetTest;

import java.util.Comparator;

public class PriceComparator implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		if(o1 instanceof Price && o2 instanceof Price){
			if(((Price)o1).money == ((Price)o2).money){
				return 0;
			}else if(((Price)o1).money > ((Price)o2).money){
				return 1;
			}else{
				return -1;
			}
		}else{
			return 0;
		}
	}
	
}
