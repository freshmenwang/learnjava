package FinalizeTest;

public class Finalize01 {

	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("À¬»ø»ØÊÕ");
	}
	
}
