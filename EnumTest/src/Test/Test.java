package Test;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EnumTest t = enumTest();
		if(t == EnumTest.SUCCESS){
			System.out.println("success");
		}
	}
	public static EnumTest enumTest(){
		return EnumTest.SUCCESS;
	}
}
