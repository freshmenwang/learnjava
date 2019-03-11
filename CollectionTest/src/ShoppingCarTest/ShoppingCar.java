package ShoppingCarTest;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ShoppingCar {
	private Map<Product,Integer> sc = new HashMap<Product,Integer>();
	public void add(Product p,int n){
		if(sc.containsKey(p)){
			sc.put(p, sc.get(p)+n);
			System.out.println("已在原有的"+p.getName()+"上"+"再添加了"+n+"个");
		}else{
			sc.put(p, n);
			System.out.println("添加了"+p.getName()+n+"个");
		}
	} 
	public void add(Product p){
		add(p,1);
	}
	public void remove(Product p,int n){
		sc.put(p, sc.get(p)-n);
		System.out.println("已减少了"+p.getName()+n+"个");
	}
	public void remove(Product p){
		remove(p,1);
	}
	public void clear(){
		sc.clear();
		System.out.println("购物车已清空");
	}
	public void show(){
		Set<Product> s = sc.keySet();
		for(Product p : s){
			System.out.println(p.getName()+"--"+sc.get(p)+"个");
		}
	}
}
