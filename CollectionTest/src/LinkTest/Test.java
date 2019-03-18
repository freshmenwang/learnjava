package LinkTest;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Link link = new Link("wjz");
		link.add("wjj");
		link.add("wjk");
		link.add("lgy");
		link.add("hzt");
		link.print();
		link.delete("hzt");
		link.delete("wjk");
		link.delete("wjz");
		link.print();
	}

}
