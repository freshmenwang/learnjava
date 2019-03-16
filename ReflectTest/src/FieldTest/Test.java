package FieldTest;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class c = Class.forName("java.util.Date");
			Field[] fs = c.getDeclaredFields();
			StringBuffer s = new StringBuffer();
			s.append(Modifier.toString(c.getModifiers())+" class "+c.getSimpleName()+"{\n");
			for(Field f : fs){
				s.append("\t"+Modifier.toString(c.getModifiers())+" "+f.getType().getSimpleName()+" "+f.getName()+" ;\n");
			}
			s.append("}");
			System.out.println(s);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
