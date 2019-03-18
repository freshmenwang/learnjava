package ConstructorTest;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class c = User.class;
		Constructor[] cn = c.getDeclaredConstructors();
		for(Constructor cnn : cn){
			System.out.print(Modifier.toString(cnn.getModifiers()) + " " + c.getSimpleName() + " ");
			Class[] cm = cnn.getParameterTypes();
			for(Class cmm : cm){
				System.out.print(cmm.getSimpleName() + " ");
			}
			System.out.println();
		}
		try {
			Constructor<User> cc = c.getDeclaredConstructor(String.class , int.class);
			User u = cc.newInstance("wjz" , 22);
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
