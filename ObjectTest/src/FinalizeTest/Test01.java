package FinalizeTest;

public class Test01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Finalize01 f = new Finalize01();
		System.out.println(f.toString());
		System.out.println(f.hashCode());
		f = null;
		System.gc();
	}

}
