package JavaTest20190120;

public class ConstructorTest {

	/**
	 * @param args                                            
	 */                                                       
	                                                          
	public static void main(String[] args) {                  
		Constructor c = new Constructor(10 , "Chris");        
		System.out.println(c.getAge() + c.getName());    
		c = null;
		c.doSome();
	}                                                         
	

}
